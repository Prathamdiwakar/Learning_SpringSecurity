package com.social.springsecurity.example;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableMethodSecurity
@RestController
public class Security {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userEndPoint() {
        return "Hello, User!";
    }

    @GetMapping("/admin")
    public String adminEndPoint() {
        return "Hello, Admin!";
    }
}
