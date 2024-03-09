package com.l20290957.avocare.services.avocadoApi.models.Huertos.responses;

public class CreateHuertos {
    private String id_Usuario;
    private String Nombre;
    private double Latitud;
    private double Longitud;
    private String Tipo_Suelo;
    private String Variedad;
    private String MercadoOBJ;
    private String Organico;
    private String EtapaFenologica;
    private String Tipo_Riego;

    public String getIDUsuario() { return id_Usuario; }
    public void setIDUsuario(String value) { this.id_Usuario = value; }

    public String getNombre() { return Nombre; }
    public void setNombre(String value) { this.Nombre = value; }

    public double getLatitud(double latitudDouble) { return Latitud; }
    public void setLatitud(double value) { this.Latitud = value; }

    public double getLongitud(double longitudDouble) { return Longitud; }
    public void setLongitud(double value) { this.Longitud = value; }

    public String getTipoSuelo(String tipoSueloValue) { return Tipo_Suelo; }
    public void setTipoSuelo(String value) { this.Tipo_Suelo = value; }

    public String getVariedad(String vaiedadValue) { return Variedad; }
    public void setVariedad(String value) { this.Variedad = value; }

    public String getMercadoOBJ(String mercadoOBJValue) { return MercadoOBJ; }
    public void setMercadoOBJ(String value) { this.MercadoOBJ = value; }

    public String getOrganico(String organicoValue) { return Organico; }
    public void setOrganico(String value) { this.Organico = value; }

    public String getEtapaFenologica(String etapaValue) { return EtapaFenologica; }
    public void setEtapaFenologica(String value) { this.EtapaFenologica = value; }

    public String getTipoRiego(String tipoRiegoValue) { return Tipo_Riego; }
    public void setTipoRiego(String value) { this.Tipo_Riego = value; }
}
