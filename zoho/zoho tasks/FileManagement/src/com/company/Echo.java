package com.company;

import java.util.ArrayList;

public class Echo {
    private Echo(){
        // private constructor to prevent instantiation
    }

    public static void echo(ArrayList<String> strings){
        for(String string : strings){
            System.out.print(string + " "); // echo the string
        }
        System.out.println();
    }
}
