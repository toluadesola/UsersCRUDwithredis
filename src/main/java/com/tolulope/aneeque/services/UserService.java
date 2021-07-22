package com.tolulope.aneeque.services;

import com.tolulope.aneeque.models.User;
import com.tolulope.aneeque.payload.request.LoginRequest;
import com.tolulope.aneeque.payload.request.SignupRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    ResponseEntity<?> saveUser(SignupRequest signupRequest);
    ResponseEntity<?> getAllUser();
    ResponseEntity<?> login(LoginRequest loginRequest);
}
