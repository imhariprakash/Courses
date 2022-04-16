package com.company;

import java.util.HashMap;

public class Resources {  // add all resources here in a hashmap

    private static HashMap<String, String> resources = new HashMap<>();


    static{
        resources.put("contacts", "www.website.com/contacts");
        resources.put("about", "www.website.com/about");
        resources.put("home", "www.website.com/home");
        resources.put("login", "www.website.com/login");
        resources.put("register", "www.website.com/register");
        resources.put("logout", "www.website.com/logout");
        resources.put("profile", "www.website.com/profile");
        resources.put("forgot password", "www.website.com/forgot-password");
        resources.put("reset password", "www.website.com/reset-password");
        resources.put("change password", "www.website.com/change-password");
        resources.put("change email", "www.website.com/change-email");
        resources.put("change username", "www.website.com/change-username");
        resources.put("change name", "www.website.com/change-name");
        resources.put("change address", "www.website.com/change-address");
        resources.put("change phone number", "www.website.com/change-phone-number");
    }

    private Resources() {
        // private constructor to prevent instantiation
    }

    public static void addResource(String name, String path) {
        resources.put(name, path);
    }

    public static boolean isResource(String name) {
        return resources.containsKey(name);
    }

    public static String getPath(String name) {
        return resources.get(name);
    }
}
