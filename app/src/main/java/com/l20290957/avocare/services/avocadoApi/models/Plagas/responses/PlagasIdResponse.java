package com.l20290957.avocare.services.avocadoApi.models.Plagas.responses;

import com.l20290957.avocare.services.avocadoApi.models.Plagas.Plagas;

public class PlagasIdResponse {
    private Plagas plagas;
    private String token;

    public Plagas getPlagasR() { return plagas; }
    public void setPlagasR(Plagas value) { this.plagas = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
