package com.androcpp.ecommerce.model;

public class Watch extends Product {

    public Watch(int id, String productName, double price, String brandName, String picture) {
        super(id, "watch", productName, price, brandName, picture);
    }

    @Override
    public String toString() {
        return String.format("Watch: %d with name %s, price %f, of brand %s, picture url: %s", id, productName, price, brand, picture);
    }

}
