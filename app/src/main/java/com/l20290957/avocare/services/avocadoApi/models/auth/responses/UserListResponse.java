package com.l20290957.avocare.services.avocadoApi.models.auth.responses;

import com.l20290957.avocare.services.avocadoApi.models.auth.User;

import java.util.List;

public class UserListResponse {
    private List<User> users;
    private String token;

    public List<User> getUsers() { return users; }
    public void setUsers(List<User> value) { this.users = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
