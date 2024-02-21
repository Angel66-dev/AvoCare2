package com.l20290957.avocare.services.avocadoApi.models.DetallesNutri;

import java.time.OffsetDateTime;

public class DetallesNutri {
    private String id;
    private String idNutrientes;
    private String idHuerto;
    private String idInfonutri;
    private OffsetDateTime fecha;

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getIDNutrientes() { return idNutrientes; }
    public void setIDNutrientes(String value) { this.idNutrientes = value; }

    public String getIDHuerto() { return idHuerto; }
    public void setIDHuerto(String value) { this.idHuerto = value; }

    public String getIDInfonutri() { return idInfonutri; }
    public void setIDInfonutri(String value) { this.idInfonutri = value; }

    public OffsetDateTime getFecha() { return fecha; }
    public void setFecha(OffsetDateTime value) { this.fecha = value; }
}
