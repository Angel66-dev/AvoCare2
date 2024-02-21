package com.l20290957.avocare.services.avocadoApi.models.Huertos.responses;

import java.util.List;

public class HuertosUserListResponse {
    private List<Object> huertos;
    private String token;

    public List<Object> getHuertos() { return huertos; }
    public void setHuertos(List<Object> value) { this.huertos = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
