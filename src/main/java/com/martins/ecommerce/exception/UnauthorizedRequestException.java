package com.martins.ecommerce.exception;

public class UnauthorizedRequestException extends EcommerceException{

    public UnauthorizedRequestException() {
        this("Unauthorized");
    }

    public UnauthorizedRequestException(String message) {
        super(message);
    }
}
