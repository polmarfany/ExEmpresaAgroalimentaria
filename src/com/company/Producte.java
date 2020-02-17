package com.company;

public abstract class Producte {

    private int numLot;
    private cData dataCaducitat;
    private String paisOrigen;
    private cData dataEmbassament;

    public Producte (int numLot, cData dataCaducitat, String paisOrigen, cData dataEmbassament) {
        this.numLot = numLot;
        this.dataCaducitat = dataCaducitat;
        this.paisOrigen = paisOrigen;
        this.dataEmbassament = dataEmbassament;
    }

    public String toString() {
        return "Num Lot = " + numLot
                + ", Data Caducitat = " + dataCaducitat.toString()
                + ", Pais Origen = " + paisOrigen
                + ", Data Embassament = " + dataEmbassament.toString();
    }

    public int getNumLot() {
        return numLot;
    }

    public cData getDataCaducitat() {
        return dataCaducitat;
    }
}
