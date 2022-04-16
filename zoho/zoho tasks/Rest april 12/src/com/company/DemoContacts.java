package com.company;

import com.google.gson.*;  // for json manipulation

import java.util.Scanner;

public class DemoContacts {  //implement contacts resource

    private DemoContacts() {
        //private constructor to prevent instantiation
    }

    public static void demo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String url = sc.nextLine(); // read from command line - url with protocol and method

            if (url.equals("")) {  // when user enters nothing - just continue the flow and ask for input again
                continue;
            }
            try {  // check domain with protocol is given or not
                if (ErrorHandler.domainHandler(url.split(" ")[1])) {     // domain check - check whether protocol is given or not is given url is correct or not
                    continue;
                }
            } catch (Exception e) {
                String method = url.split(" ")[0];  // method check - check whether method is given or not
                if(!(method.equals("GET") || method.equals("POST") || method.equals("PUT") || method.equals("DELETE"))) {
                    ErrorHandler.inputHandler("Invalid URL - Invalid method - domain and resources not mentioned");
                    continue;
                }
                ErrorHandler.inputHandler("No URL - Not enough resources"); // if resources are not mentioned
                continue;
            }

            try {    // Resource check - is there in URL
                String resource = url.split(" ")[1].replace("//", "/").split("/")[2].toLowerCase();
                if (!Resources.isResource(resource)) {  // check whether resource is there in the server or not
                    ErrorHandler.resourceHandler("Resource not found");
                    continue;
                }
            } catch (Exception e) {
                ErrorHandler.resourceHandler("Resource not mentioned.");
                continue;
            }

            String method = url.split(" ")[0].toUpperCase(); // method check - check whether method is given or not
            String uri = url.split(" ")[1]; // take url with protocol alone for further processing

            switch (method) {

                case "GET":
                    get(uri);  // call get method
                    break;
                case "POST":
                    post(uri); // call post method
                    break;
                case "PUT":
                    put(uri); // call put method
                    break;
                case "DELETE":
                    delete(uri); // call delete method
                    break;
                case "EXIT":
                    return; // exit the program
                default:
                    ErrorHandler.methodHandler();  // if method is not given - mentioned method is not correct
            }
        }
    }

    public static void get(String url) {   // GET
        if (url.replace("//", "/").split("/").length > 4) {  //url resource check
            ErrorHandler.inputHandler("Invalid URL - Extra resources mentioned");
            return;
        }

        JsonObject json = getJson();   // read from command line string(json -valid) and return json object

        if (!checkUsernamePassword(json)) {  // authenticate user
            return;
        }

        if (url.replace("//", "/").split("/").length == 3) {  // bulk retrieve - if no id mentioned
            if (!Authentication.authorize(json.get("username").getAsString(), "read", "null")) { //no user has bulk read access
                return;
            }
            SuccessHandler.bulkGetHandler(json);
        }

        if(url.replace("//", "/").split("/").length == 4) {   // single retrieve - if id is mentioned
            try{  // check whether authorized to read
                if(!authorize(json, "read")){
                    return;
                }
                SuccessHandler.getHandler(Contacts.getPerson(json.get("id").getAsString()), "Retrieved successfully");
            }catch (Exception e){
                ErrorHandler.resourceHandler("ID not found");
            }
        }
    }

    public static void post(String url) {  // POST
        if (url.replace("//", "/").split("/").length > 3) {  //url resource check
            ErrorHandler.inputHandler("Invalid URL - Extra resources mentioned");
            return;
        }

        JsonObject json = getJson();   // read from json

        if (!checkUsernamePassword(json)) {  // authenticate user
            return;
        }

        if (!Authentication.authorize(json.get("username").getAsString(), "create", "new")) {
            return; // new user - new in argument is just a dummy
        }

        try { // create new person add to contacts and add a user to the user list
            Person personObj = new Person(json.get("name").getAsString(), json.get("phone").getAsString());
            Contacts.addPerson(personObj);
            Authentication.addUser(json.get("name").getAsString(), json.get("name").getAsString(), (json.get("name").getAsString() + "@gmail.com"), "self");
            SuccessHandler.creationHandler(personObj, "Person added successfully");
        } catch (Exception e) {
            ErrorHandler.inputHandler("Invalid JSON - name or phone field missing");
        }//
    }

    public static void put(String url) {  // PUT - update
        if (url.replace("//", "/").split("/").length > 4) {  //url resource check
            ErrorHandler.inputHandler("Invalid URL - Extra resources mentioned");
            return;
        }

        JsonObject json = getJson();   // read from json

        if (!checkUsernamePassword(json)) {  // authenticate user
            return;
        }

        if (url.replace("//", "/").split("/").length == 3) {  // bulk update
            if (!Authentication.authorize(json.get("username").getAsString(), "update", "null")) { //no user has bulk read access
                return;
            }

            SuccessHandler.bulkUpdateHandler(json);
        }

        if(url.replace("//", "/").split("/").length == 4) {   // single update
            try{
                if(!authorize(json, "update")){ // function telling whether authorized or not to update
                    return;
                }
                SuccessHandler.updateHandler(Contacts.getPerson(json.get("id").getAsString()), json, "Updated successfully");
            }catch (Exception e){
                ErrorHandler.resourceHandler("ID not found");
            }
        }
    }

    public static void delete(String url) {  // DELETE
        if (url.replace("//", "/").split("/").length > 4) { //url resource check
            ErrorHandler.inputHandler("Invalid URL - Extra resources mentioned");
            return;
        } else if (url.replace("//", "/").split("/").length == 3) {
            ErrorHandler.inputHandler("Invalid URL - Id not mentioned to delete");
            return;
        }

        JsonObject json = getJson();   // read from json

        if (!checkUsernamePassword(json)) { // authenticate user
            return;
        }

        try { // delete person if authorized
            if (!Authentication.authorize(json.get("username").getAsString(), "create", json.get("id").getAsString())) {
                return;
            }
        } catch (Exception e) {
            ErrorHandler.inputHandler("Invalid JSON - id field missing");
        }

        try { // delete person from contacts and delete user from user list
            Person personObj = Contacts.getPerson(json.get("id").getAsString());
            Contacts.removePerson(json.get("id").getAsString());
            Authentication.removeUser(json.get("id").getAsString());
            SuccessHandler.deletionHandler(personObj, "Person deleted successfully");
        }catch (Exception e) {
            ErrorHandler.inputHandler("Contact not found");
        }
    }

    public static JsonObject getJson() { // read from json string - convert and return as json object
        Scanner sc = new Scanner(System.in);
        String json = sc.nextLine();
        try {
            return (new Gson().fromJson(json, JsonObject.class));
        } catch (Exception e) {
            ErrorHandler.inputHandler("Invalid JSON - Cannot convert to JsonObject");
            return (new Gson().fromJson("{}", JsonObject.class));
        }
    }

    public static boolean checkUsernamePassword(JsonObject json) {
        if (json.entrySet().isEmpty()) {
            return false;
        }
        try {
            if (!Authentication.authenticate(json.get("username").getAsString(), json.get("password").getAsString())) {
                return false;
            }
        } catch (Exception e) {
            ErrorHandler.inputHandler("Invalid JSON - Missing username or password field");
            return false;
        }
        return true;
    }

    public static boolean authorize(JsonObject json, String method) {
        try {
            if (!Authentication.authorize(json.get("username").getAsString(), method, json.get("id").getAsString())) {
                return false;
            }
        } catch (Exception e) {
            ErrorHandler.inputHandler("Invalid JSON - id field missing");
            return false;
        }
        return true;
    }

}


/*
    POST https://www.google.com/contacts
    {"username":"admin","password":"admin","name":"John","phone":"1234567890"}
    POST https://www.google.com/contacts
    {"username":"admin","password":"admin","name":"john1","phone":"1234567891"}
    POST https://www.google.com/contacts
    {"username":"admin","password":"admin","name":"john2","phone":"1234567892"}
    POST https://www.google.com/contacts
    {"username":"admin","password":"admin","name":"john3","phone":"1234567893"}
    GET https://www.google.com/contacts
    {"username":"john","password":"john"}
    GET https://www.google.com/contacts
    {"username":"admin","password":"admin","id":["ZOHO10001","ZOHO10002","ZOHO10003","ZOHO10006"]}
    DELETE https://www.google.com/contacts/ZOHO10001
    {"username":"admin","password":"admin","id":"ZOHO10001"}
    GET https://www.google.com/contacts/ZOHO10001
    {"username":"admin","password":"admin","id":"ZOHO10001"}
    GET https://www.google.com/contacts
    {"username":"admin","password":"admin","id":["ZOHO10001","ZOHO10002","ZOHO10003","ZOHO10004"]}
    PUT https://www.google.com/contacts
    {"username":"admin","password":"admin","contacts":[{"id":"ZOHO10001","name":"ram","phone":"9999999991"},{"id":"ZOHO10002","name":"ram1","phone":"9999999992"},{"id":"ZOHO10003","name":"ram2","phone":"9999999993"},{"id":"ZOHO10010","name":"ram3","phone":"9999999994"}]}
 */
