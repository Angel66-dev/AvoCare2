package com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.responses;

import com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.AlertaEnf;

import java.util.List;

public class AlertaEnfListResponse {
    private List<AlertaEnf> alertaenfermedades;
    private String token;

    public List<AlertaEnf> getAlertaenfermedades() { return alertaenfermedades; }
    public void setAlertaenfermedades(List<AlertaEnf> value) { this.alertaenfermedades = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
