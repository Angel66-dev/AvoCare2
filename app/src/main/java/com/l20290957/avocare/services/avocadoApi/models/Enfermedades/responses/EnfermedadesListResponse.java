package com.l20290957.avocare.services.avocadoApi.models.Enfermedades.responses;

import com.l20290957.avocare.services.avocadoApi.models.Enfermedades.Enfermedades;

import java.util.List;

public class EnfermedadesListResponse {
    private List<Enfermedades> detalles;
    private String token;

    public List<Enfermedades> getDetalles() { return detalles; }
    public void setDetalles(List<Enfermedades> value) { this.detalles = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
