package com.example.w22comp1011gctest2student;

public class Product {

  //Instance variables
  private String id;
  private String sku;
  private String name ;
  private String salePrice;
  private String regularPrice;
  private String image;

  //Getters
  public String getSku() {
    return sku;
  }

  public String getName() {
    return name;
  }

  public String getSalePrice() {
    return salePrice;
  }

  public String getRegularPrice() {
    return regularPrice;
  }

  public String getImage() {
    return image;
  }



  //Overridden method
  @Override
  public String toString() {
    return String.format("[%S]-$[%S]", name, salePrice);
  }

  public Object getSum() {
    return getSum();
  }

  public Double getSumAsDouble() {
    return getSumAsDouble();
  }
}

