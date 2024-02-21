package com.l20290957.avocare.services.avocadoApi.models.auth.responses;

public class LoginUser {
    private String correo;
    private String contra;

    public String getCorreo() { return correo; }
    public void setCorreo(String value) { this.correo = value; }

    public String getContra() { return contra; }
    public void setContra(String value) { this.contra = value; }
}
