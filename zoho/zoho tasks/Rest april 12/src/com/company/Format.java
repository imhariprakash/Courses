package com.company;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public class Format
{
    private Format(){
        // private constructor - since utility class with static methods are not meant to be instantiated
    }
    public static void format(){
        System.out.println("No internet - Response couldn't be sent.");
    } // formatting for no internet connection
    public static void format(int code, String message) // for error codes and messages
    {
        System.out.println(code + " " + ResponseCode.responses.get(code) + "\n");
        int len = (code + " " + ResponseCode.responses.get(code)).length();
        String json = "{\"Server\": \"Java Server\", \"Content-Type\": \"text/html\", \"Content-Length\": \"" + len + "\", \"Connection\": \"closed\", \"Code\": \"" + code + "\", \"Status\": \"" + ResponseCode.responses.get(code) +"\", \"Response\": \"<h1>/" + code + " " + ResponseCode.responses.get(code) + "</h1>\", \"Message\": \"" + message + "\"}";
        JsonObject convertedObject = new Gson().fromJson(json, JsonObject.class);
        System.out.println(convertedObject);
        System.out.println("\n{\n\tServer: Java Server\n\tContent-Type: text/html\n\tContent-Length: " + len + "\n\tConnection: closed\n\tCode: " + code + "\n\tStatus: Error\n\t\n\t<html>\n\t\t<h1>\n\t\t\t"  + code + " " + ResponseCode.responses.get(code) + " \n\t\t</h1>\n\t</html>\n\tMessage: " + message + "\n}");
    }

    public static void format(int code, Person person, String message) { // for error codes and messages with person - display name,id.contact
        System.out.println(code + " " + ResponseCode.responses.get(code));
        int len = person.getId().length() + person.getPhone().length() + person.getName().length();
        String json = "{\"Server\": \"Java Server\", \"Content-Type\": \"application/json\", \"Content-Length\": \"" + len + "\", \"Connection\": \"closed\", \"Code\": \"" + code + "\", \"Status\": \"" + ResponseCode.responses.get(code) +"\", \"id\": \"" + person.getId() + "\", \"username\": \"" + person.getName() + "\", \"Contact\": \"" + person.getPhone() + "\", \"Message\": \"" + message + "\"}";
        JsonObject convertedObject = new Gson().fromJson(json, JsonObject.class);
        System.out.println(convertedObject);
        System.out.println("\n{\n\tServer: Java Server\n\tContent-Type: text/html\n\tContent-Length: " + len + "\n\tConnection: closed\n\tCode: " + code + "\n\tStatus:" +  ResponseCode.responses.get(code) + "\n\t\n\t<html>\n\t\t<h1>\n\t\t\t"  + code + " " + ResponseCode.responses.get(code) + " \n\t\t</h1>\n\t\t<p>\n\t\t\tid : " + person.getId() + "\n\t\t\tusername : " + person.getName() + "\n\t\t\tphone : " + person.getPhone() + "\n\t\t</p>\n\t</html>\n\tMessage: " + message + "\n}");
    }

    public static void format(int code, JsonObject json) { // for error codes and messages with person - display name,id.contact - bulk
        String responses = "[";
        String message = "[";
        String htmlResponse = "";
        int len = 0;
        try {
            for (JsonElement value : json.get("id").getAsJsonArray()) {
                try {
                    String temp = getResponse(Contacts.getPerson(value.getAsString()));
                    if (temp.equals("\"\"")) {
                        message += "\"ID " + value.getAsString() + " not found.,\"";
                    } else {
                        responses += temp + ",";
                        htmlResponse += getHtmlResponse(Contacts.getPerson(value.getAsString()));
                        len += Contacts.getPerson(value.getAsString()).getId().length() + Contacts.getPerson(value.getAsString()).getPhone().length() + Contacts.getPerson(value.getAsString()).getName().length();
                    }
                } catch (Exception e) {
                    message += "\"ID " + value.getAsString() + " not found.,\"";
                }
            }
        } catch (Exception e) {
            for(Person person : Contacts.getAllPersons()) {
                responses += getResponse(person) + ",";
                htmlResponse += getHtmlResponse(person);
                len += person.getId().length() + person.getPhone().length() + person.getName().length();
            }
            message += "\"All contacts found.\"";
        }

        message += "]";
        message = message.replace(",\"]", "\"]");
        responses += "]";
        responses = responses.replace(",,]", "]");
        if(responses.equals("[]")){
            ErrorHandler.resourceHandler("No such ids found");
            return;
        }
        System.out.println(code + " " + ResponseCode.responses.get(code));

        // JSON response
        String textJson = "{\"Server\":\"Java Server\",\"Content-Type\":\"application/json\",\"Content-Length\":\"" + len + "\",\"Connection\":\"closed\",\"Code\":\"" + code + "\",\"Status\":\"" + ResponseCode.responses.get(code) +"\",\"Responses\":" + responses + ",\"Message\":" + message + "}";
        JsonObject convertedObject = new Gson().fromJson(textJson, JsonObject.class);
        System.out.println(convertedObject);

        // HTML response inside json
        System.out.println("\n{\n\tServer: Java Server\n\tContent-Type: text/html\n\tContent-Length: " + len + "\n\tConnection: closed\n\tCode: " + code + "\n\tStatus:" +  ResponseCode.responses.get(code) + "\n\t\n\t<html>\n\t\t<h1>\n\t\t\t"  + code + " " + ResponseCode.responses.get(code) + " \n\t\t</h1>" + htmlResponse + "\n\t</html>\n\tMessage: " + message + "\n}");


    }

    public static void format(int code, String responses, String htmlResponse, String message, int len) { // just format json response, html response along with error code and messages
        String textJson = "{\"Server\":\"Java Server\",\"Content-Type\":\"application/json\",\"Content-Length\":\"" + len + "\",\"Connection\":\"closed\",\"Code\":\"" + code + "\",\"Status\":\"" + ResponseCode.responses.get(code) +"\",\"Responses\":" + responses + ",\"Message\":" + message + "}";
        JsonObject convertedObject = new Gson().fromJson(textJson, JsonObject.class);
        System.out.println(convertedObject);

        // HTML response inside json
        System.out.println("\n{\n\tServer: Java Server\n\tContent-Type: text/html\n\tContent-Length: " + len + "\n\tConnection: closed\n\tCode: " + code + "\n\tStatus:" +  ResponseCode.responses.get(code) + "\n\t\n\t<html>\n\t\t<h1>\n\t\t\t"  + code + " " + ResponseCode.responses.get(code) + " \n\t\t</h1>" + htmlResponse + "\n\t</html>\n\tMessage: " + message + "\n}");

    }

    public static String getResponse(Person person){ // get response for json
        try{
            return("{\"id\":\"" + person.getId() + "\",\"username\":\"" + person.getName() + "\",\"phone\":\"" + person.getPhone() + "\"}");
        }catch(NullPointerException e){
            return("");
        }
    }

    public static String getHtmlResponse(Person person){ // get response for html
        try{
            return("\n\t\t<p>\n\t\t\tID: " + person.getId() + "\n\t\t\tName: " + person.getName() + "\n\t\t\tPhone: " + person.getPhone() + "\n\t\t</p>");
        }catch(NullPointerException e){
            return("");
        }
    }


}

/*
    System.out.println("{\n\tServer: Java Server\n\tContent-Type: text/html\n\tContent-Length: " + 14 + "\n\tConnection: close\n\t\n\t<h1>200 OK</h1>\n\tMessage: \" + message + \"\\n}");
 */