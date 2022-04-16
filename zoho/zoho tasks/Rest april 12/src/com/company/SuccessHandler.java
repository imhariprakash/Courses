package com.company;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class SuccessHandler {

    private SuccessHandler() {
    } // private constructor to prevent instantiation
    public static void creationHandler(Person contact, String message){
        Format.format(201, contact, message);
    } // for handling creation of a contact

    public static void deletionHandler(Person contact, String message){
        Format.format(204, contact, message);
    }
    // for handling deletion of a contact

    public static void updateHandler(Person contact, JsonObject json, String message){ // for handling single update of a contact

        try {
            String temp = contact.getName();
            contact.setName(json.get("name").getAsString()); // success means update the user map also for authentication
            Authentication.removeUser(temp);
            Authentication.addUser(json.get("name").getAsString(), json.get("name").getAsString(), (json.get("name").getAsString() + "@gmail.com"), "self");
        } catch (Exception e){
            //don't do anything
        }

        try{
            contact.setPhone(json.get("phone").getAsString());
        }catch (Exception e){
            //don't do anything
        }

        Format.format(200, contact, message);
    }
    public static void getHandler(Person contact, String message){
        Format.format(200, contact, message);
    } // for handling get request for a contact

    public static void bulkGetHandler(JsonObject json){
        Format.format(200, json);
    }
    // for handling bulk get request for contacts

    public static void bulkUpdateHandler(JsonObject json){ // for handling bulk update of contacts
        String message = "[";
        String responses = "[";
        String htmlResponse = "";
        int len = 0;

        try{ // check whether the json has contacts field or not
            json.get("contacts"); // check if the json has contacts
        }catch (Exception e) {
            message += "\"contacts field not found in json - None of the mentioned ids were updated.\"";
        }

        for (JsonElement value : json.get("contacts").getAsJsonArray()) {
            Person contact;
            try {
                contact = Contacts.getPerson(value.getAsJsonObject().get("id").getAsString());
            } catch (Exception e) {
                message += "\"ID " + value.getAsJsonObject().get("id").getAsString() + " not found.,\"";
                return;
            }
            try {
                contact.getName(); // check if the contact exists - not null for sure ?
                try {
                    String temp = contact.getName(); // get the name of the contact for updating the user map
                    contact.setName(value.getAsJsonObject().get("name").getAsString()); // success means update the user map also for authentication
                    Authentication.removeUser(temp);
                    Authentication.addUser(value.getAsJsonObject().get("name").getAsString(), value.getAsJsonObject().get("name").getAsString(), (value.getAsJsonObject().get("name").getAsString() + "@gmail.com"), "self");
                } catch (Exception e) {
                    //don't do anything no name means - no need to update name
                }
                try {
                    contact.setPhone(value.getAsJsonObject().get("phone").getAsString());
                } catch (Exception e) {
                    //don't do anything no phone means - no need to update phone
                }
                String temp = Format.getResponse(contact);
                if (temp.equals("\"\"")) {
                    message += "\"ID " + value.getAsJsonObject().get("id").getAsString() + " not found.,\"";
                } else {
                    responses += temp + ",";
                    htmlResponse += Format.getHtmlResponse(contact);
                    len += contact.getId().length() + contact.getPhone().length() + contact.getName().length();
                }
            } catch (Exception e) {
                message += "\"ID " + value.getAsJsonObject().get("id").getAsString() + " not found.,\"";
            }
        }

        message += "]";
        message = message.replace(",\"]", "\"]");
        responses += "]";
        responses = responses.replace(",,]", "]");
        if(responses.equals("[]")){
            ErrorHandler.resourceHandler(message);
            return;
        }
        if(message.equals("[]")){
            message = "\"Successfully updated all the contacts mentioned.\"";
        }
        Format.format(202, responses, htmlResponse, message, len);
    }


}
