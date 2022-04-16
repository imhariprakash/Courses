package com.company;

public class Person {
    private final String id;
    private String name;
    private String phone;
    private static int count = 10001;

    public Person(String name, String phone) {
        this.id = "ZOHO" + (count++);
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    } // getter for id

    public String getName() {
        return name;
    } // getter for name

    public void setName(String name) {
        this.name = name;
    } // setter for name

    public String getPhone() {
        return phone;
    } // getter for phone

    public void setPhone(String phone) {
        this.phone = phone;
    } // setter for phone
}
