package com.company;

public class Developer {
    private String name;
    private String email;
    private String password;
    private String role;

    public Developer(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }  //getName of the user

    public void setName(String name) {
        this.name = name;
    } //setName of the user

    public String getEmail() { // getEmail of the user
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } //setEmail of the user

    public String getPassword() {
        return password;
    }  //getPassword of the user

    public void setPassword(String password) {
        this.password = password;
    }  //setPassword of the user

    public String getRole() {
        return role;
    }  //getRole of the user

    public void setRole(String role) {
        this.role = role;
    } //setRole of the user
}
