package com.fernandoschimidt.ecommerce.services.auth;

import com.fernandoschimidt.ecommerce.dto.SignupRequest;
import com.fernandoschimidt.ecommerce.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);


    Boolean hasUserWithEmail(String email);
}
