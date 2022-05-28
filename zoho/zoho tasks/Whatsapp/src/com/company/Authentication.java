package com.company;

import com.google.i18n.phonenumbers.NumberParseException;

import java.util.Scanner;

public class Authentication {


    private Authentication() {
    } // private constructor to prevent instantiation

    public static void isAuthenticated() throws NumberParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Login/signup?: "); // prompt user for login/signup
        String input = sc.nextLine(); // read user input
        input = input.replace(" ", "").toLowerCase(); // remove spaces and convert to lowercase

        if (input.equals("login") || input.equals("signin")) {
            Login.login();
        }
        else if (input.equals("signup")) { // if user wants to signup
            SignUp.signUp();
        }
        else { // if user input is not valid
            System.out.println("Invalid input. Please try again.\n");
            Authentication.isAuthenticated();
        }
    }
}
