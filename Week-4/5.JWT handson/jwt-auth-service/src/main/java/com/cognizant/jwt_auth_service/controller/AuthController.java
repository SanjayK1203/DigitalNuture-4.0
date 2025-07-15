package com.cognizant.jwt_auth_service.controller;

import com.cognizant.jwt_auth_service.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Principal principal) {
        String token = jwtUtil.generateToken(principal.getName());
        return Map.of("token", token);
    }
}