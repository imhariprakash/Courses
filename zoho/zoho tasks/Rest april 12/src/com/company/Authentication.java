package com.company;
import java.util.HashMap;

public class Authentication {
    private static HashMap<String, Developer> users = new HashMap <>(); // store all users with their login credentials

    static{ // Static initializer block - add some users to test
        users.put("admin", new Developer("admin", "abcdef@gmail.com", "admin", "all"));
        users.put("dev", new Developer("dev",  "imdev@gmail.com", "dev", "crud"));
        users.put("user", new Developer("user", "imuser@gmail.com", "user", "read"));
    } // End of static initializer block

    private Authentication(){} // Private constructor to prevent instantiation
    public static void addUser(String username, String password, String email, String role) {  // add users (login credentials)
        users.put(username, new Developer(username, email, password, role));
    }

    public static void removeUser(String username) {
        users.remove(username);
    } // remove user - can't be used to authorize next time as it is gone for good - next time null(not exist) is returned



    public static boolean authenticate(String username, String password) {  // authenticate user - check if user exists and password is correct
        //System.out.println(users.get(username).getPassword());
        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) { // if user exists and password is correct
            return true;
        }
        else {
            if(!users.containsKey(username)) { // if user doesn't exist
                ErrorHandler.resourceHandler("User does not exist");
            }
            else if(!users.get(username).getPassword().equals(password)) { // if password is incorrect
                ErrorHandler.authenticateHandler("Incorrect password");
            }
        }
        return false;
    }

    public static boolean authorize(String username, String task, String id){ // authorize user - check if user has permission to perform task on id
        String role;
        try {
            role = users.get(username).getRole(); // null means - user doesn't exist - null exception is thrown
        }catch(NullPointerException e){
            ErrorHandler.resourceHandler("User does not exist"); // if user doesn't exist
            return false;
        }

        if(role.equals("all")){  // if user has all permissions
            return true;
        }
        else if(role.equals("crud") && (task.equals("create") || task.equals("read") || task.equals("update") || task.equals("delete"))){  // if user has CRUD permissions
            return true;
        }
        else if(role.equals("read") && (task.equals("read"))){ // if user has read permissions
            return true;
        }

        else if(role.equals("self")) { // if user has self permissions - only do tasks in their own account
            if(id.equals("null")){ // if id is null - user is trying to do a bulk tasks - not allowed - return false
                ErrorHandler.authenticateHandler("You are not authorized to perform this action");
                return false;
            }
            try { // if id is not null - user is trying to do a single task - check if id belongs to user
                if ((task.equals("read") || task.equals("update") || task.equals("delete")) && Contacts.getPerson(id).getName().equals(username)) {
                    return true;
                }
                else{ // if id doesn't belong to user - return false
                    ErrorHandler.authenticateHandler("You are not authorized to perform this action");
                    return(false);
                }
            } catch (NullPointerException e) { // if id doesn't exist - return false
                ErrorHandler.resourceHandler("Contact does not exist");
            }
        }
        else { // if user doesn't have permissions - return false
            ErrorHandler.authorizationHandler("You are not authorized to perform this action");
            return false;
        }

        return false;
    }

}
