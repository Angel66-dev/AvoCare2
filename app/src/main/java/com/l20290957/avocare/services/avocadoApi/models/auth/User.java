package com.l20290957.avocare.services.avocadoApi.models.auth;

public class User {

    private String id;
    private String nombre;
    private String correo;
    private boolean isActive;
    private long v;

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getNombre() { return nombre; }
    public void setNombre(String value) { this.nombre = value; }

    public String getCorreo() { return correo; }
    public void setCorreo(String value) { this.correo = value; }

    public boolean getIsActive() { return isActive; }
    public void setIsActive(boolean value) { this.isActive = value; }

    public long getV() { return v; }
    public void setV(long value) { this.v = value; }
}

