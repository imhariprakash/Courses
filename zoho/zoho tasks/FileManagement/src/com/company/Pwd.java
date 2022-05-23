package com.company;

public class Pwd {

    private Pwd() {
    } // Prevents instantiation of this class

    public static void pwd() {
        System.out.println(Paths.getCanonicalPath());
    }
}
