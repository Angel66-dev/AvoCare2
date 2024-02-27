package com.l20290957.avocare.services.avocadoApi.models.Nutrientes.responses;

import com.l20290957.avocare.services.avocadoApi.models.Nutrientes.Nutrientes;

public class NutrientesIdResponse {
    private Nutrientes nutriente;
    private String token;

    public Nutrientes getNutriente() { return nutriente; }
    public void setNutriente(Nutrientes value) { this.nutriente = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
