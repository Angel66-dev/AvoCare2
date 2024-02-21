package com.l20290957.avocare.services.avocadoApi.models.Huertos.responses;

import com.l20290957.avocare.services.avocadoApi.models.Huertos.Huertos;

import java.util.List;

public class HuertosListResponse {
    private List<Huertos> huertos;
    private String token;

    public List<Huertos> getHuertos() { return huertos; }
    public void setHuertos(List<Huertos> value) { this.huertos = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
