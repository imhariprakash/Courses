package com.company;

import java.util.HashMap;

public class Contacts {
    private static HashMap<String, Person> contacts = new HashMap<>(); // HashMap of contacts

    private Contacts() {} // private constructor to prevent instantiation

    public static void addPerson(Person person) {
        contacts.put(person.getId(), person);
    } // addPersons

    public static void removePerson(String id) {
        contacts.remove(id);
    } // removePersons

    public static int count() {
        return contacts.size();
    }  //get how many objects there in hashmap - future use

    public static void print() {  // print all contacts - future use
        for (Person person : contacts.values()) {
            System.out.println(person);
        }
    }

    public static Person getPerson(String id) {
        return contacts.get(id);
    } // getPerson object that belongs to that id

    public static Person[] getAllPersons(){
        return contacts.values().toArray(new Person[0]);
    }  // get all objects as array
}
