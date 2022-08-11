package com.company;

 import com.google.gson.Gson;

import com.google.gson.Gson;

public class PostFeatures {
    private PostFeatures() {
    } // private constructor to hide the implicit public one

     public static void createContact() {
         System.out.println("Creating contact...\n");
         String contact_type = "customer";
         String customer_sub_type = UserInput.getWord("Enter customer sub type: ");
         String contact_name = UserInput.getString("Enter contact name: ");
         String company_name = UserInput.getString("Enter company name: ");
         boolean is_portal_enabled = UserInput.getBoolean("Is portal enabled? (true/false): ");
         Gson gson = new Gson();
         String json = gson.toJson(new Contact(contact_type, customer_sub_type, contact_name, company_name, is_portal_enabled));

     }
}
