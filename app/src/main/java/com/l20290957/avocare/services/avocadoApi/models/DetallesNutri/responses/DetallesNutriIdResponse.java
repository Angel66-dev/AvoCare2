package com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.responses;

import com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.DetallesNutri;

public class DetallesNutriIdResponse {
    private DetallesNutri detallesnutri;
    private String token;

    public DetallesNutri getDetallesnutri() { return detallesnutri; }
    public void setDetallesnutri(DetallesNutri value) { this.detallesnutri = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
