package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class UserInput { // class for user input
    private static final Scanner sc = new Scanner(System.in); //creates a scanner object

    private UserInput() {
    } // Prevents instantiation of this class

    public static int getInt(){
        return(sc.nextInt());
    } // Inputs an integer

    public static int getInt(Scanner in){
        return(in.nextInt());
    } // Inputs an integer

    public static String getString(){
        return(sc.nextLine());
    } // Inputs a string (with nextLine())

    public static String getString(Scanner in){
        return(in.nextLine());
    } // Inputs a string (with nextLine())

    public static String getWord(){  // Inputs a word (with next())
        return(sc.next());
    }

    public static String getWord(Scanner in){
        return(in.next());
    } // Inputs a word (with next())

    public static double getDouble(){
        return(sc.nextDouble());
    } // Inputs a double

    public static double getDouble(Scanner in){
        return(in.nextDouble());
    } // Inputs a double

    public static char getChar(){
        return(sc.next().charAt(0));
    } // Inputs a character

    public static char getChar(Scanner in){
        return(in.next().charAt(0));
    } // Inputs a character

    public static boolean getBoolean(){
        return(sc.nextBoolean());
    }  // Inputs a boolean

    public static boolean getBoolean(Scanner in){
        return(in.nextBoolean());
    } // Inputs a boolean

    public static void close(){
        sc.close();
    } // Closes the scanner

    public static Scanner getInputStreamScanner(InputStream inputStream){
        return new Scanner(inputStream);
    } // Returns a scanner object

    public static void closeInputStreamScanner(Scanner in){
        in.close();
    } // Closes the scanner object

    public static String getString_synchronized(){
        String str = sc.nextLine();
        while(str == null || str.equals("")){
            try{
                Thread.currentThread().sleep(1);
            } catch(Exception e) {
                ErrorHandler.handleError(e, "Error in getString_synchronized()");
            }
            str =sc.nextLine();
        }
        return(str);
    } // Pauses the program until the user inputs something

}