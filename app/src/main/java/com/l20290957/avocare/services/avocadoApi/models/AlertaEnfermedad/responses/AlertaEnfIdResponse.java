package com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.responses;

import com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.AlertaEnf;

public class AlertaEnfIdResponse {
    private AlertaEnf alertasenf;
    private String token;

    public AlertaEnf getAlertasenf() { return alertasenf; }
    public void setAlertasenf(AlertaEnf value) { this.alertasenf = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
