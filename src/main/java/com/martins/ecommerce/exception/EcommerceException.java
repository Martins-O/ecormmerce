package com.martins.ecommerce.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class EcommerceException extends RuntimeException {
    private final HttpStatus status;

    public EcommerceException() {
        this("An error occurred");
    }

    public EcommerceException(String message) {
        this(message, HttpStatus.BAD_REQUEST);
    }

    public EcommerceException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
