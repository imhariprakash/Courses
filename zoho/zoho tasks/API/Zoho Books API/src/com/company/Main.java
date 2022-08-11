package com.company;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
//        RequestHandler.initializeToken();
//
//        String response = GetFeatures.getCustomers();
//
//        JsonParser jp = new JsonParser();
//        JsonElement je = jp.parse(response);

//        for(JsonElement jse : je.getAsJsonObject().getAsJsonArray("contacts")){
//            String contact_id = jse.getAsJsonObject().get("contact_id").getAsString();
//            String customer_name = jse.getAsJsonObject().get("customer_name").getAsString();
//            String company_name = jse.getAsJsonObject().get("company_name").getAsString();
//            boolean zoho_crm = jse.getAsJsonObject().get("is_linked_with_zohocrm").getAsBoolean();
//            updateDataBase(contact_id, customer_name, company_name, zoho_crm);
//        }

        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3365/zoho_books", "roo65t", "imhari");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE customer SET zoho_crm = true WHERE contact_id = '846949000086023'");
            stmt.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }






//        while (true) {
//            System.out.println("\n0. Exit 1. GET 2. POST 3. PUT 4. DELETE");
//            System.out.print("\nEnter your choice: ");
//            int choice = UserInput.getInt();
//
//            switch (choice) {
//                case 0:
//                    return;
//                case 1:
//                    RequestMethod.get();
//                    break;
//                case 2:
//                    RequestMethod.post();
//                    break;
//                case 3:
//                    RequestMethod.put();
//                    break;
//                case 4:
//                    RequestMethod.delete();
//                    break;
//                default:
//                    System.out.println("Invalid choice!");
//            }
//        }
    }

//    public static void updateDataBase(String contact_id, String customer_name, String company_name, boolean zoho_crm){
//        try{
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3378/zoho_books", "root", "85gjg");
//            Statement stmt = conn.createStatement();
//            stmt.executeUpdate("INSERT INTO customer(contact_id,customer_name,company_name,zoho_crm) VALUES(\"" + contact_id + "\",\"" + customer_name + "\",\"" + company_name + "\"," + zoho_crm + ")");
//            stmt.close();
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
}
