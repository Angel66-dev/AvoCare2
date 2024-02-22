package com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.responses;

import com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.Cuarentenarias;

public class CuarentenariasIdResponse {
    private Cuarentenarias plagasCuR;
    private String token;

    public Cuarentenarias getPlagasCuR() { return plagasCuR; }
    public void setPlagasCuR(Cuarentenarias value) { this.plagasCuR = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
