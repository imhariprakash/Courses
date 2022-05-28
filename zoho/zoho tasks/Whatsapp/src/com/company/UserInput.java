package com.company;

import java.util.Scanner;

public class UserInput {

    private static final Scanner sc = new Scanner(System.in); //creates a scanner object

    private UserInput() {
    } // Prevents instantiation of this class

    public static int getInt(){
        return(sc.nextInt());
    } // Inputs an integer

    public static String getString(){
        return(sc.nextLine());
    } // Inputs a string (with nextLine())

    public static String getWord(){  // Inputs a word (with next())
        return(sc.next());
    }

    public static double getDouble(){
        return(sc.nextDouble());
    } // Inputs a double

    public static char getChar(){
        return(sc.next().charAt(0));
    } // Inputs a character

    public static boolean getBoolean(){
        return(sc.nextBoolean());
    }  // Inputs a boolean

    public static void close(){
        sc.close();
    } // Closes the scanner
}
