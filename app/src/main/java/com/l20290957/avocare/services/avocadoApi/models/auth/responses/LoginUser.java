package com.l20290957.avocare.services.avocadoApi.models.auth.responses;

public class LoginUser {
    private String Correo;
    private String Contra;

    public String getCorreo() { return Correo; }
    public void setCorreo(String value) { this.Correo = value; }

    public String getContra() { return Contra; }
    public void setContra(String value) { this.Contra = value; }
}
