package com.martins.ecommerce.service;

import com.martins.ecommerce.model.dto.request.SignUpRequest;
import com.martins.ecommerce.model.dto.response.SignUpDto;

public interface AppUserService {
    SignUpDto signUp(SignUpRequest request);
}
