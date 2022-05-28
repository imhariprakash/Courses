package com.company;

import com.google.i18n.phonenumbers.NumberParseException;

import java.util.Locale;

public class SignUp {  // Sign up class

    private SignUp(){} //private constructor to prevent instantiation

    public static void signUp() throws NumberParseException {

        String country, phoneNumber, email, password, confirmPassword;

        System.out.println("\n<------------Sign up-------------->");

        while(true) {
            System.out.print("Enter your country: ");
            country = UserInput.getString();
            if(CountryCodes.hasCountry(country)) {
                break;
            }
            System.out.println("Invalid country name. Please try again - Check spelling and put spaces if necessary.");
        }

        while(true) {
            System.out.print("Enter your phone number: ");
            phoneNumber = UserInput.getString(); //get phone number
            if(!(ValidatePhoneNumber.validate(phoneNumber, CountryCodes.getCode(country)))) {  //check if phone number is valid
                System.out.println("Invalid mobile number!");
                if(loginInstead()) {
                    Login.login();
                    return;
                }
                continue;
            }
            if(Users.hasUser(phoneNumber)){
                System.out.println("User already exists.\n");
                if(loginInstead()) {
                    Login.login();
                    return;
                }
                continue;
            }
            break;
        }

        while(true) {
            System.out.println("Note : Password must have atleast one special character and uppercase character\n");
            System.out.print("Enter your password: ");
            password = UserInput.getString(); //get password
            System.out.print("Confirm your password: ");
            confirmPassword = UserInput.getString(); //get password confirmation
            if(password.equals(confirmPassword)) { //check if password and confirmation match
                if(!hasSpecialCharacter(password)) {
                    System.out.println("Password must have atleast one special character and uppercase character");
                    continue;
                }
                break;
            }
            System.out.println("Passwords do not match. Please try again.");
            if(loginInstead()){
                Login.login();
                return;
            }
        }

        System.out.print("Enter your name: ");
        String name = UserInput.getString(); //get name

        System.out.print("Enter your surname: ");
        String surname = UserInput.getString(); //get surname

        while(true) {
            System.out.print("Enter your email: ");
            email = UserInput.getString(); //get email
            if(ValidateEmail.validate(email)) { //check if email is valid
                break;
            }
            System.out.println("Invalid email. Please try again.");
        }

        Users.addUser(phoneNumber, password); //add user to database

        System.out.println("\n<------------Sign up complete-------------->");

//        User user = new User(name, surname, email, password, phoneNumber, address, city, country, postCode);
//        User.addUser(user);
    }

    public static boolean loginInstead(){
        System.out.print("Do you want to Login instead (Y/N) : ");
        String input = UserInput.getString();
        if(input.charAt(0) == 'y' || input.charAt(0) == 'Y'){
            return true;
        }
        return false;
    }

    public static boolean hasSpecialCharacter(String password){
        boolean flag1 = false, flag2 = false;
        for(int i = 0; i < password.length(); i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                flag1 = true;
            }
            if(Character.isUpperCase(password.charAt(i))){
                flag2 = true;
            }
        }
        return(flag1 && flag2);
    }

}
