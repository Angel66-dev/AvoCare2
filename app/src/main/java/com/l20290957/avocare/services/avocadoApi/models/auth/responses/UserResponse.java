package com.l20290957.avocare.services.avocadoApi.models.auth.responses;

import com.l20290957.avocare.services.avocadoApi.models.auth.User;

public class UserResponse {
    private User user;
    private String token;

    public User getUser() { return user; }
    public void setUser(User value) { this.user = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
