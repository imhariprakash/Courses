package com.company;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandler {
    private FileHandler() {
    } // private constructor to prevent instantiation

    public static String readFile(String fileName) {
        File file = new File(fileName);
        Scanner scanner = UserInput.getScanner(file);
        return(scanner.nextLine());
    }

    public static String readFile(File file) {
        Scanner scanner = UserInput.getScanner(file);
        return(scanner.nextLine());
    }

    public static void writeFile(String fileName, String text) {
        try{
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (Exception e) {
            ErrorHandle.handleError(e, "Error writing to file: " + fileName + " in writeFile()");
        }
    }
}
