package com.martins.ecommerce.exception;

import org.springframework.http.HttpStatus;

public class UsernameAlreadyUsedException extends EcommerceException {
    public UsernameAlreadyUsedException() {
        this("Username already used");
    }

    public UsernameAlreadyUsedException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
