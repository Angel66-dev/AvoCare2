package com.l20290957.avocare.services.avocadoApi.models.Nutrientes.responses;

public class CreateNutrientes {
    private String idInfonutri;
    private String fosforo;
    private String potacio;
    private String magnecio;
    private String calcio;

    public String getIDInfonutri() { return idInfonutri; }
    public void setIDInfonutri(String value) { this.idInfonutri = value; }

    public String getFosforo() { return fosforo; }
    public void setFosforo(String value) { this.fosforo = value; }

    public String getPotacio() { return potacio; }
    public void setPotacio(String value) { this.potacio = value; }

    public String getMagnecio() { return magnecio; }
    public void setMagnecio(String value) { this.magnecio = value; }

    public String getCalcio() { return calcio; }
    public void setCalcio(String value) { this.calcio = value; }
}
