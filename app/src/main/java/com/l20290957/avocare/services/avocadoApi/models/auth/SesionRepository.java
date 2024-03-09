package com.l20290957.avocare.services.avocadoApi.models.auth;

public class SesionRepository {
    private static SesionRepository _instance = null;
    private User UsuarioLogeado = null;
    private String token = null;

    public static SesionRepository getInstance() {
        if ( _instance == null)
            _instance = new SesionRepository();

        return _instance;
    }

    public User getUsuarioLogeado() { return UsuarioLogeado; }
    public void setUsuarioLogeado(User value) { this.UsuarioLogeado = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = "Bearer " + value; }
}
