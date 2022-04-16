package com.company;


import java.util.Scanner;
import java.util.HashMap;


public class Main {

    HashMap<String, String> resources = new HashMap<>();

    public static void main(String[] args) throws Exception {
        DemoContacts.demo(); // calls demo of the contacts class - we have only one resource - contacts

    }




}



/*

        String emailData = scanner.nextLine();
        JsonObject jsonObject = JsonParser.parseString(emailData).getAsJsonObject();
        System.out.println(jsonObject.get("Success"));
        System.out.println(jsonObject.get("Message"));

        "{\"Success\":true,\"Message\":\"Invalid access token.\"}"
        {"Success":true,"Message":"Invalid access token."}

        {"username":"test","password":"test","id":[1,2,3,4,5,6,7,8,9,10]}
 */