package com.social.springsecurity.example;

import java.util.List;

public class LoginResponse {
    private String jwtToken;
    private String username;
    private List<String> roles;

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public List<String> getRoles() {
        return roles;
    }

    public LoginResponse(String jwtToken, List<String> roles, String username) {
        this.jwtToken = jwtToken;
        this.roles = roles;
        this.username = username;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
