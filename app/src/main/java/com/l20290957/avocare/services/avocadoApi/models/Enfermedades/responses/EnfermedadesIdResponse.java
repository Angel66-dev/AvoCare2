package com.l20290957.avocare.services.avocadoApi.models.Enfermedades.responses;

import com.l20290957.avocare.services.avocadoApi.models.Enfermedades.Enfermedades;

public class EnfermedadesIdResponse {
    private Enfermedades enfermedades;
    private String token;

    public Enfermedades getEnfermedades() { return enfermedades; }
    public void setEnfermedades(Enfermedades value) { this.enfermedades = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
