package com.androcpp.ecommerce.model;

public enum Brand {

    apple("apple"),
    samsung("samsung"),
    oneplus("oneplus"),
    xiaomi("xiaomi");

    private String brandName;

    Brand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}
