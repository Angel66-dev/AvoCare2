package com.l20290957.avocare.services.avocadoApi.models.Huertos.responses;

import com.l20290957.avocare.services.avocadoApi.models.Huertos.Huertos;

public class HuertosIdResponse {
    private Huertos huerto;
    private String token;

    public Huertos getHuerto() { return huerto; }
    public void setHuerto(Huertos value) { this.huerto = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
