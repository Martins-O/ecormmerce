package com.martins.ecommerce.model.dto.request;

public class SignUpRequest {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;
    private LocalTime lastActivity;
    private Boolean loggedIn;
}
