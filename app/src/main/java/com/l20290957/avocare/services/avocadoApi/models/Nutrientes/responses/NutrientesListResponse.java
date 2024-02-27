package com.l20290957.avocare.services.avocadoApi.models.Nutrientes.responses;

import com.l20290957.avocare.services.avocadoApi.models.Nutrientes.Nutrientes;

import java.util.List;

public class NutrientesListResponse {
    private List<Nutrientes> nutrientes;
    private String token;

    public List<Nutrientes> getNutrientes() { return nutrientes; }
    public void setNutrientes(List<Nutrientes> value) { this.nutrientes = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
