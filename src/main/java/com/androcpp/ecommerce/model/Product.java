package com.androcpp.ecommerce.model;

public class Product {

    protected int id;
    protected String category;
    protected String productName;
    protected double price;
    protected String brand;
    protected String picture;

    public Product(int id, String category, String productName, double price, String brandName, String picture) {
        this.id = id;
        this.category = category;
        this.productName = productName;
        this.price = price;
        this.brand = brandName;
        this.picture = picture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brandName) {
        this.brand = brandName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
