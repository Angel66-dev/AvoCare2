package com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.responses;

import com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.AlertaEnf;

import java.util.List;

public class AlertaEnfIdEnfermedadResponse {
    private List<AlertaEnf> alertas;
    private String token;

    public List<AlertaEnf> getAlertas() { return alertas; }
    public void setAlertas(List<AlertaEnf> value) { this.alertas = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
