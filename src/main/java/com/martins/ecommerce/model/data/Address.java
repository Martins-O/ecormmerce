package com.martins.ecommerce.model.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
    @Id
    private String id;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

}
