package com.company;

import com.google.i18n.phonenumbers.NumberParseException;

public class Main {
    public static void main(String[] args) throws NumberParseException {
        Authentication.isAuthenticated();

        UserInput.close();

    }
}