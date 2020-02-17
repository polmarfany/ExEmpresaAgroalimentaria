package com.company;

public class CongelatNitrogen extends Congelat {

    private int metodeCongelacio;
    private double tempsExposicioNitrogen;

    public CongelatNitrogen (int numLot, cData dataCaducitat, String paisOrigen, cData dataEmbassament, double temperaturaManteniment, int metodeCongelacio, double tempsExposicioNitrogen) {
        super(numLot, dataCaducitat, paisOrigen, dataEmbassament, temperaturaManteniment);
        this.metodeCongelacio = metodeCongelacio;
        this.tempsExposicioNitrogen = tempsExposicioNitrogen;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Metode Congelacio = " + metodeCongelacio +
                ", Temps Exposicio Nitrogen = " + tempsExposicioNitrogen + "s";
    }
}
