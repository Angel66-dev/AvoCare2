package com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.responses;

import com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.Cuarentenarias;

import java.util.List;

public class CuarentenariasListResponse {
    private List<Cuarentenarias> plagascu;
    private String token;

    public List<Cuarentenarias> getPlagascu() { return plagascu; }
    public void setPlagascu(List<Cuarentenarias> value) { this.plagascu = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
