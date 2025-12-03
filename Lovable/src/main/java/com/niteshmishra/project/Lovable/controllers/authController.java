package com.niteshmishra.project.Lovable.controllers;

import com.niteshmishra.project.Lovable.dto.auth.AuthResponse;
import com.niteshmishra.project.Lovable.dto.auth.LoginRequest;
import com.niteshmishra.project.Lovable.dto.auth.SignupRequest;
import com.niteshmishra.project.Lovable.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")

public class authController {
    private AuthService authService;

    @PostMapping("/signup")
    public Repository<AuthResponse> signup(SignupRequest request){
        return ResponseEntity.ok(authService.signup(request))
    }git

    @PostMapping("/login")
    public Repository<AuthResponse> login(LoginRequest request){
        return ResponseEntity.ok(authService.(login(request)))
    }

}
