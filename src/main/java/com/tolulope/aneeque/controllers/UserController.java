package com.tolulope.aneeque.controllers;

import com.tolulope.aneeque.payload.request.LoginRequest;
import com.tolulope.aneeque.payload.request.SignupRequest;
import com.tolulope.aneeque.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest loginRequest){
        return userService.login(loginRequest);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signupRequest){
        return userService.saveUser(signupRequest);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers(){
        return userService.getAllUser();
    }



}
