package com.company;


public class ErrorHandler {

    private ErrorHandler(){
        //private constructor to prevent instantiation
    }
    public static boolean domainHandler(String url) throws Exception { //returns true if domain is valid
        return(DomainTest.domainHandler(url));
    }

    public static void methodHandler() { //calls format method with 404 - method not found
        Format.format(404, "Method not found");
    }

    public static void inputHandler(String message){
        Format.format(400, message);
    } //calls format method with 400 - bad request

    public static void resourceHandler(String message) { //calls format method with 404 - resource not found
        Format.format(404, message);
    }

    public static void authorizationHandler(String message){ //calls format method with 403 - forbidden access
        Format.format(403, message);
    }

    public static void authenticateHandler(String message){
        Format.format(401, message);
    }  //calls format method with 401 - unauthorized access
}
