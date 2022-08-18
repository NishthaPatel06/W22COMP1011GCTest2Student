package com.st200474598.w22comp1011gctest2student;

import java.util.ArrayList;

public class Customer {

    //Instance variables
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private ArrayList<Product> purchases;

    //Getters
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Product> getPurchases() {
        return purchases;
    }
}
