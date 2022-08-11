package com.company;

public class ErrorHandler {
    private ErrorHandler() {
    } // private constructor to prevent instantiation

    public static void handleError(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    public static void handleError(Exception e, String message){
        System.out.print(message + " - ");
        handleError(e);
    }
}
