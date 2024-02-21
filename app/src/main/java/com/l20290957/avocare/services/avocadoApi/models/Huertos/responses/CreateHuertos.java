package com.l20290957.avocare.services.avocadoApi.models.Huertos.responses;

public class CreateHuertos {
    private String idUsuario;
    private String nombre;
    private double latitud;
    private double longitud;
    private String tipoSuelo;
    private String variedad;
    private String mercadoOBJ;
    private String organico;
    private String etapaFenologica;
    private String tipoRiego;

    public String getIDUsuario() { return idUsuario; }
    public void setIDUsuario(String value) { this.idUsuario = value; }

    public String getNombre() { return nombre; }
    public void setNombre(String value) { this.nombre = value; }

    public double getLatitud() { return latitud; }
    public void setLatitud(double value) { this.latitud = value; }

    public double getLongitud() { return longitud; }
    public void setLongitud(double value) { this.longitud = value; }

    public String getTipoSuelo() { return tipoSuelo; }
    public void setTipoSuelo(String value) { this.tipoSuelo = value; }

    public String getVariedad() { return variedad; }
    public void setVariedad(String value) { this.variedad = value; }

    public String getMercadoOBJ() { return mercadoOBJ; }
    public void setMercadoOBJ(String value) { this.mercadoOBJ = value; }

    public String getOrganico() { return organico; }
    public void setOrganico(String value) { this.organico = value; }

    public String getEtapaFenologica() { return etapaFenologica; }
    public void setEtapaFenologica(String value) { this.etapaFenologica = value; }

    public String getTipoRiego() { return tipoRiego; }
    public void setTipoRiego(String value) { this.tipoRiego = value; }
}
