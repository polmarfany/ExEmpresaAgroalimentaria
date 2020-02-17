package com.company;

public class Refrigerat extends Producte{

    private int codiOrganismeSA;
    private double temperaturaManteniment;

    public Refrigerat (int numLot, cData dataCaducitat, String paisOrigen, cData dataEmbassament, int codiOrganismeSA, double temperaturaManteniment) {
        super(numLot, dataCaducitat, paisOrigen, dataEmbassament);
        this.codiOrganismeSA = codiOrganismeSA;
        this.temperaturaManteniment = temperaturaManteniment;
    }

    @Override
    public String toString() {
        return super.toString()
                + " CodiOrganismeSA = " + codiOrganismeSA
                + " Temperatura Manteniment = " + temperaturaManteniment + "ºC";
    }
}
