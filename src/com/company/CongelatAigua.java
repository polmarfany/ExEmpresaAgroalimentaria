package com.company;

public class CongelatAigua extends Congelat{

    private double salinitatAigua;

    public CongelatAigua (int numLot, cData dataCaducitat, String paisOrigen, cData dataEmbassament, double temperaturaManteniment, double salinitatAigua) {
        super(numLot, dataCaducitat, paisOrigen, dataEmbassament, temperaturaManteniment);
        this.salinitatAigua = salinitatAigua;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salinitat Aigua = " + salinitatAigua + "g/L";
    }
}
