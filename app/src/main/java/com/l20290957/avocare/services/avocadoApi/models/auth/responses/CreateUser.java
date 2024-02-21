package com.l20290957.avocare.services.avocadoApi.models.auth.responses;

public class CreateUser {
    private String correo;
    private String contra;
    private String nombre;

    public String getCorreo() { return correo; }
    public void setCorreo(String value) { this.correo = value; }

    public String getContra() { return contra; }
    public void setContra(String value) { this.contra = value; }

    public String getNombre() { return nombre; }
    public void setNombre(String value) { this.nombre = value; }
}
