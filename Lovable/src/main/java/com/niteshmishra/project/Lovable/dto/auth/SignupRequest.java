package com.niteshmishra.project.Lovable.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
