package com.l20290957.avocare.services.avocadoApi.models.AlertaPlaga.responses;

import com.l20290957.avocare.services.avocadoApi.models.AlertaPlaga.AlertaPlaga;

public class AlertaPlagaIdResponse {
    private AlertaPlaga alertaspla;
    private String token;

    public AlertaPlaga getAlertaspla() { return alertaspla; }
    public void setAlertaspla(AlertaPlaga value) { this.alertaspla = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
