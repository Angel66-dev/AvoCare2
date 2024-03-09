package com.l20290957.avocare.services.avocadoApi.models.auth;

public class User {
    private static User _instance = null;

    private String _id;
    private String Nombre;
    private String Correo;
    private boolean isActive;
    private long v;
    public static User getInstance() {
        if ( _instance == null)
            _instance = new User();

        return _instance;
    }

    public String getID() { return _id; }
    public void setID(String value) { this._id = value; }

    public String getNombre() { return Nombre; }
    public void setNombre(String value) { this.Nombre = value; }

    public String getCorreo() { return Correo; }
    public void setCorreo(String value) { this.Correo = value; }

    public boolean getIsActive() { return isActive; }
    public void setIsActive(boolean value) { this.isActive = value; }

    public long getV() { return v; }
    public void setV(long value) { this.v = value; }
}

