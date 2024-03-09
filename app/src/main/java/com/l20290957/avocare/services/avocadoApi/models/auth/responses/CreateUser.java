package com.l20290957.avocare.services.avocadoApi.models.auth.responses;

public class CreateUser {
    private static CreateUser _instance = null;
    private String Correo;
    private String Contra;
    private String Nombre;

    public static CreateUser getInstance() {
        if ( _instance == null)
            _instance = new CreateUser();

        return _instance;
    }

    public String getCorreo() { return Correo; }
    public void setCorreo(String value) { this.Correo = value; }

    public String getContra() { return Contra; }
    public void setContra(String value) { this.Contra = value; }

    public String getNombre() { return Nombre; }
    public void setNombre(String value) { this.Nombre = value; }
}
