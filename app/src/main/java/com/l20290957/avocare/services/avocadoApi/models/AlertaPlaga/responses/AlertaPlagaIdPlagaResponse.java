package com.l20290957.avocare.services.avocadoApi.models.AlertaPlaga.responses;

import com.l20290957.avocare.services.avocadoApi.models.AlertaPlaga.AlertaPlaga;

import java.util.List;

public class AlertaPlagaIdPlagaResponse {
    private List<AlertaPlaga> alertaplagas;
    private String token;

    public List<AlertaPlaga> getAlertaplagas() { return alertaplagas; }
    public void setAlertaplagas(List<AlertaPlaga> value) { this.alertaplagas = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
