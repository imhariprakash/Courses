package com.company;

public class ErrorHandler {
    private ErrorHandler() {
        // private constructor to prevent instantiation
    }

    public static void invalidMethod(String message) {
        System.out.println(message);
    }

    public static void tooLongInput(String message) {
        System.out.println(message);
    }

    public static void EmptyFolderName(String message) {
        System.out.println(message);
    }

    public static void FolderNotFound(String message) {
        System.out.println(message);
    }

}
