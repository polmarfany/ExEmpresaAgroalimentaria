package com.company;

public class CongelatAire extends Congelat {

    private double percentatgeOxigen;
    private double percentatgeNitrogen;
    private double percentatgeVapor;

    public CongelatAire (int numLot, cData dataCaducitat, String paisOrigen, cData dataEmbassament, double temperaturaManteniment, double percentatgeNitrogen, double percentatgeOxigen, double percentatgeVapor) {
        super(numLot, dataCaducitat, paisOrigen, dataEmbassament, temperaturaManteniment);
        this.percentatgeOxigen = percentatgeOxigen;
        this.percentatgeNitrogen = percentatgeNitrogen;
        this.percentatgeVapor = percentatgeVapor;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Percentatge Oxigen = " + percentatgeOxigen + "%" +
                ", Percentatge Nitrogen=" + percentatgeNitrogen + "%" +
                ", Percentatge Vapor=" + percentatgeVapor+ "%" ;
    }
}
