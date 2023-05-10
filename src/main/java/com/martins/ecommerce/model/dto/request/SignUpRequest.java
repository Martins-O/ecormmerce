package com.martins.ecommerce.model.dto.request;

import com.martins.ecommerce.model.data.Address;

import java.time.LocalTime;

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
