package com.example.w22comp1011gctest2student;

// Java program to read JSON from a file
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class CustomerArraylists {

    static void task3() {

        ArrayList<Customer> ProductsList = new ArrayList<>();
        ProductsList.add(new Customer(78, "woo-vneck-tee-blue", 14.0, 15.0, "https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/vnech-tee-blue-1.jpg"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String text = gson.toJson(ProductsList);
        System.out.println();
        System.out.println(text);
        System.out.println();
        System.out.println();
        try {
            passingInfoToTheJsonReader(text);
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    static void passingInfoToTheJsonReader(String text) throws IOException {

        JsonReader reader = new JsonReader(new StringReader(text));

        reader.beginArray();
        while (reader.hasNext()) {
            reader.beginObject();
            while (reader.hasNext()) {

                reader.endObject();
            }
            reader.endArray();
        }
    }
}
