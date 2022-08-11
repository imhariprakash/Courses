package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Response_Handler {
    private Response_Handler() {
    } // private constructor to prevent instantiation

    public static void handleResponse(String response) {
        System.out.println(response);
    }

    public static void prettyJsonString(String response){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response);
        String prettyJsonString = gson.toJson(je);
        System.out.println("\n" + prettyJsonString);
    }

    public static String getUserId(String response){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response);
        String userId = je.getAsJsonObject().getAsJsonArray("data").get(0).getAsJsonObject().get("id").getAsString();
        return userId;
    }
}
