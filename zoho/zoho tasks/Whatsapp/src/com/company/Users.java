package com.company;

import java.util.HashMap;
import java.io.*;

public class Users {

    private static HashMap<String, String> credentials = new HashMap<>();

    private Users() {} // Prevent instantiation of this class

    static{
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\S HARIPRAKASH\\Desktop\\Whatsapp\\src\\com\\company\\data\\login.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                //addUser(parts[0], parts[1], "fromFile");
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean hasUser(String phoneNumber){
        return(credentials.containsKey(phoneNumber));
    }

    public static void addUser(String username, String password) {
        credentials.put(username, password);
        addToLoginFile(username, password);
    }

    public static void addUser(String username, String password, String source) {
        if(source.equals("fromFile")) {
            credentials.put(username, password);
        }
    }

    public static void addToLoginFile(String username, String password) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\S HARIPRAKASH\\Desktop\\Whatsapp\\src\\com\\company\\data\\login.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            out.println(username + " " + password);
            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static boolean checkCredentials(String username, String password) {
        if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
            return true;
        }
        if(credentials.containsKey(username)){
            System.out.println("Username not found.");
        }
        else{
            System.out.println("Incorrect password");
        }
        return false;
    }
}
