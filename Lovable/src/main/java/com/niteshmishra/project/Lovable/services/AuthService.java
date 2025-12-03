package com.niteshmishra.project.Lovable.services;

import com.niteshmishra.project.Lovable.dto.auth.AuthResponse;
import com.niteshmishra.project.Lovable.dto.auth.LoginRequest;
import com.niteshmishra.project.Lovable.dto.auth.SignupRequest;

public interface AuthService {

    AuthResponse signup(SignupRequest request);
    AuthResponse login(LoginRequest request);
}
