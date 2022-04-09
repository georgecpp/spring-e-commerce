package com.androcpp.ecommerce.exception;

public class NoProductException extends RuntimeException {
    public NoProductException(String errorMessage) {
        super(errorMessage);
    }
}
