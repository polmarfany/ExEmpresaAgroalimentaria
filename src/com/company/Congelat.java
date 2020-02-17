package com.company;

public abstract class Congelat extends Producte{

    private double temperaturaManteniment;

    public Congelat (int numLot, cData dataCaducitat, String paisOrigen, cData dataEmbassament, double temperaturaManteniment) {
        super(numLot, dataCaducitat, paisOrigen, dataEmbassament);
        this.temperaturaManteniment = temperaturaManteniment;
    }

    @Override
    public String toString() {
        return super.toString()
               + ", Temperatura Manteniment=" + temperaturaManteniment + "ºC";
    }
}
