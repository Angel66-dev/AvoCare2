package com.l20290957.avocare.services.avocadoApi.models.Plagas.responses;

import com.l20290957.avocare.services.avocadoApi.models.Plagas.Plagas;

import java.util.List;

public class PlagasListResponse {
    private List<Plagas> plagas;
    private String token;

    public List<Plagas> getPlagas() { return plagas; }
    public void setPlagas(List<Plagas> value) { this.plagas = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
