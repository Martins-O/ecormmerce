package com.martins.ecommerce.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Data
@Builder
public class EcommerceExceptionResponse {
    private Map<String, String> data;

    private String message;

    private HttpStatus status;
}
