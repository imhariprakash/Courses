package com.company;

public class ErrorHandle {
    private ErrorHandle() {
    } // private constructor to prevent instantiation

    public static void handleError(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    public static void handleError(String message) {
        System.out.println("Error: " + message);
    }

    public static void handleError(Exception e, String message) {
        System.out.println("Error: " + message + " : " + e.getMessage());
    }
}
