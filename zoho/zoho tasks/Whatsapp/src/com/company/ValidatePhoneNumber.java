package com.company;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/*
    PhoneNumberUtil class provides formatting, parsing and validation
    getInstance() method is loaded with all phone number metadata
 */


public class ValidatePhoneNumber {

    private ValidatePhoneNumber() {
    } // prevent instantiation of this class


    //function that validates mobile numbers
    public static boolean validate(String number, String country) throws NumberParseException
    {
        if(country.length() > 2){
            country = CountryCodes.getCode(country);
        }
        // getInstance() method is loaded with all phone number metadata
        PhoneNumberUtil numberUtil = PhoneNumberUtil.getInstance();

        //the parse() method parses a string and country and returns it as a phone number in proto buffer format
        PhoneNumber phoneNumber = numberUtil.parse(number, country);

        //tests whether a phone number matches a valid pattern or not
        return(numberUtil.isValidNumber(phoneNumber));
    }



}
