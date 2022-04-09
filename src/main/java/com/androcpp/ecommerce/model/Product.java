package com.androcpp.ecommerce.model;

public abstract class Product {

    protected int id;
    protected String productName;
    protected double price;
    protected Brand brand;
    protected String picture;

    public Product(int id, String productName, double price, Brand brand, String picture) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
