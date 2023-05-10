package com.martins.ecommerce.exception;

import org.springframework.http.HttpStatus;

public class InvalidLoginDetailsException extends EcommerceException{

    public InvalidLoginDetailsException() {
        this("Invalid login details");
    }

    public InvalidLoginDetailsException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
