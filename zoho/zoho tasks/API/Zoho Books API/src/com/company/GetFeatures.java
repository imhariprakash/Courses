package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class GetFeatures {
    private GetFeatures() {
    } // private constructor to prevent instantiation

    public static String getCustomers(){
        try {
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> response = Unirest.get("https://books.zoho.in/api/v3/contacts?organization_id=60010")
                    .header("Authorization", "Bearer " + RequestHandler.getAccessToken())
                    .asString();
            return(response.getBody());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void prettyJsonString(String response){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response);
        String prettyJsonString = gson.toJson(je);
        System.out.println("\n" + prettyJsonString);
    }

    public static String getUserId(String response){
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response);
        String userId = je.getAsJsonObject().getAsJsonArray("data").get(0).getAsJsonObject().get("id").getAsString();
        return userId;
    }
}
