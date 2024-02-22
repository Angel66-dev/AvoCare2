package com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.responses;

import java.time.OffsetDateTime;

public class CreateCuarentenarias {
    private String idHuerto;
    private String idPlagas;
    private OffsetDateTime fechaOcurre;

    public String getIDHuerto() { return idHuerto; }
    public void setIDHuerto(String value) { this.idHuerto = value; }

    public String getIDPlagas() { return idPlagas; }
    public void setIDPlagas(String value) { this.idPlagas = value; }

    public OffsetDateTime getFechaOcurre() { return fechaOcurre; }
    public void setFechaOcurre(OffsetDateTime value) { this.fechaOcurre = value; }
}
