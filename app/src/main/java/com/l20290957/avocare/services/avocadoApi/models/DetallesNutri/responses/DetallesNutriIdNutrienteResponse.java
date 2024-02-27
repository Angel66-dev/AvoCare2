package com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.responses;

import com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.DetallesNutri;

import java.util.List;

public class DetallesNutriIdNutrienteResponse {
    private List<DetallesNutri> nutrientes;
    private String token;

    public List<DetallesNutri> getNutrientes() { return nutrientes; }
    public void setNutrientes(List<DetallesNutri> value) { this.nutrientes = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
