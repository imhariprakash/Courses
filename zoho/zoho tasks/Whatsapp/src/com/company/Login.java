package com.company;

import com.google.i18n.phonenumbers.NumberParseException;

public class Login {
    private Login() {
    } // Prevents instantiation of this class

    public static void login() throws NumberParseException { // This is the method that is called to login to the system
        System.out.println("\n<------------Login-------------->");

        String country, mobileNumber, password, confirmPassword;

        while(true) {
            System.out.print("Enter your country: ");
            country = UserInput.getString();
            if(CountryCodes.hasCountry(country)) {
                break;
            }
            System.out.println("Invalid country name. Please try again - Check spelling and put spaces if necessary.");
        }

        while(true) {
            System.out.print("Mobile Number: ");
            mobileNumber = UserInput.getString(); // Get mobile number - no spaces allowed(word)
            if(ValidatePhoneNumber.validate(mobileNumber, country)) { // Validate mobile number
                break;
            }
        }

        while(true) {
            System.out.print("Enter your password: ");
            password = UserInput.getString(); //get password - no spaces allowed
            System.out.print("Confirm your password: ");
            confirmPassword = UserInput.getString(); //get password confirmation - no spaces allowed
            if(password.equals(confirmPassword)) { //check if password and confirmation match
                break;
            }
            System.out.println("Passwords do not match. Please try again.");
        }

        if(!Users.hasUser(mobileNumber)){
            System.out.println("User not found!");
            if(signUpInstead()){
                SignUp.signUp();
                return;
            }
            Login.login();
            return;
        }

        if(Users.checkCredentials(mobileNumber, password)){
            System.out.println("Password is wrong!");
            if(signUpInstead()){
                SignUp.signUp();
                return;
            }
            Login.login();
            return;
        }
    }

    public static boolean signUpInstead(){
        System.out.print("Do you want to Sign up instead (Y/N) : ");
        String input = UserInput.getString();
        if(input.charAt(0) == 'y' || input.charAt(0) == 'Y'){
            return true;
        }
        return false;
    }
}
