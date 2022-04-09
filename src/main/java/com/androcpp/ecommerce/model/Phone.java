package com.androcpp.ecommerce.model;

public class Phone extends Product {

    public Phone(int id, String productName, double price, Brand brand, String picture) {
        super(id, productName, price, brand, picture);
    }

    @Override
    public String toString() {
        return String.format("Phone: %d with name %s, price %f, of brand %s, picture url: %s", id, productName, price, brand.getBrandName(), picture);
    }
}
