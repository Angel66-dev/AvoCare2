package com.l20290957.avocare.services.avocadoApi.models.Huertos;

public class HuertosRepository {
    private static HuertosRepository _instance = null;
    private Huertos huerto;
    private String token;

    public static HuertosRepository getInstance() {
        if ( _instance == null)
            _instance = new HuertosRepository();

        return _instance;
    }
    public Huertos getHuerto() { return huerto; }
    public void setHuerto(Huertos value) { this.huerto = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
