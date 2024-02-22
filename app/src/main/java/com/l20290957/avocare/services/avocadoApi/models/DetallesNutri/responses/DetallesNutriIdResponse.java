package com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.responses;

import com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.DetallesNutri;

public class DetallesNutriIdResponse {
    private DetallesNutri nutriente;
    private String token;

    public DetallesNutri getNutriente() { return nutriente; }
    public void setNutriente(DetallesNutri value) { this.nutriente = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
