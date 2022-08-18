//Name : Nishtha Patel
//Student Number: 200474598

package com.example.w22comp1011gctest2student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;

public class Customer {


    //Instance variables
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private ArrayList<Product> purchases;

    //Constructors for products
    public Customer(int i, String s, double v, double v1, String s1) {
    }

    public Customer() {

    }

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

//special methods

    public static void main(String[] args) {
        ArrayList<Product> Products = new ArrayList<>();
        Products.addAll(Arrays.asList(CustomerArraylists.getSearch()));

        OptionalDouble salePrice = Products.stream()
                .map(Product -> Product.getSum())            //converted to a stream
                .mapToInt(Total -> Double.parseDouble((String) DoubleSummaryStatistics))
                .Sum();

        OptionalDouble sum = null;
        System.out.printf("The Total saleprice  is: %f%n", sum.isPresent() ? sum.getAsDouble() : -1);

        System.out.println(Products.stream()
                .filter(Product -> Product.getSumAsDouble() < 2000)
                .toList());


    }

    }
