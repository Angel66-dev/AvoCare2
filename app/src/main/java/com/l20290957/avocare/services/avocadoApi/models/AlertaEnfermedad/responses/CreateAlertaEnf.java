package com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.responses;

import java.time.OffsetDateTime;

public class CreateAlertaEnf {
    private String idHuerto;
    private String idEnfermedades;
    private OffsetDateTime fechaAlert;

    public String getIDHuerto() { return idHuerto; }
    public void setIDHuerto(String value) { this.idHuerto = value; }

    public String getIDEnfermedades() { return idEnfermedades; }
    public void setIDEnfermedades(String value) { this.idEnfermedades = value; }

    public OffsetDateTime getFechaAlert() { return fechaAlert; }
    public void setFechaAlert(OffsetDateTime value) { this.fechaAlert = value; }
}
