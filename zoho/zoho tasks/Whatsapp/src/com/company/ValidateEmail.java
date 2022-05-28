package com.company;

import java.util.regex.*;

public class ValidateEmail{

    private ValidateEmail(){} //private constructor to prevent instantiation

    public static boolean validate(String email){  // regex for email validation

        if(email == null){ // if email is null return false
            return false;
        }
        //Regular Expression
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        //Compile regular expression to get the pattern
        Pattern pattern = Pattern.compile(regex);
        //check if email is valid
        //Create instance of matcher
        Matcher matcher = pattern.matcher(email);

        // return matcher result - true if email is valid and false if email is invalid
        return(matcher.matches());
    }
}
