package com.androcpp.ecommerce.exception;

public class DuplicateProductException extends RuntimeException {
    public DuplicateProductException(String errorMessage) {
        super(errorMessage);
    }
}
