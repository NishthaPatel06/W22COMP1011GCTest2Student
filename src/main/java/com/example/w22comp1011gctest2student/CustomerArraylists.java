package com.example.w22comp1011gctest2student;

// Java program to read JSON from a file
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class CustomerArraylists {

    static void task3() {

        ArrayList<Customer> ProductsList = new ArrayList<>();
        ProductsList.add(new Customer(78, "woo-neck-tee-blue", 14.0, 15.0, "https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/vnech-tee-blue-1.jpg"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String text = gson.toJson(ProductsList);
        System.out.println();
        System.out.println(text);
        System.out.println();
        System.out.println();

    }


    public static Customer getCustomersFromJSONFile(String fileName) {
        //create a GSON object to parse the objects
        Gson gson = new Gson();
        Customer response = null;

        try (

                FileReader fileReader = new FileReader(fileName);
                JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            response = gson.fromJson(jsonReader, Customer.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    public static Product[] getPurchasesFromJSONFileArray(String fileName) {
        //create a GSON object to parse the objects
        Gson gson = new Gson();
        Product[] purchases = null;

        try (

                FileReader fileReader = new FileReader(fileName);
                JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            purchases = gson.fromJson(jsonReader, Product[].class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return purchases;
    }
}
