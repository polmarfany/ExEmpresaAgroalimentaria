package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GestioProductes {
    public static Scanner teclat = new Scanner(System.in);
    public static String LS = System.lineSeparator();

    public static ArrayList<Producte> arrayListProductes = new ArrayList<>();

    public static void main(String[] args) {
        
        System.out.println("Benvingut a la gestió de productes MAXIM.");

        while (true) {
            String menu = "Benvingut al Menú." + LS
                    + "'0'. Exit program." + LS
                    + "'1'. Afegir un producte" + LS
                    + "'2'. Mostrar tots els productes." + LS
                    + "'3'. Mostrar tots els productes amb cert filtre" + LS;

            switch ( demanarOpcio(menu, 3) ) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    afegirProducte();
                    break;
                case 2:
                    mostrarTots();
                    break;
                 case 3:
                    mostrarFiltre();
                    break;
            }
        }
    }
    //L'UNICA PART QUE FORMA PART DEL EXAMEN, TOT L'ALTRE ES BASTANT COPY PASTE D'AVIONS
    
    public static void afegirProducte() {
        String preg = "1. Producte Fresc" + LS
                + "2. Producte Refrigerat" + LS
                + "3. Producte Congelat Aire" + LS
                + "4. Producte Congelat Aigua" + LS
                + "5. Producte Congelat Nitrogen";
        switch (demanarOpcio(preg, 5) ) {
            case 1:
                arrayListProductes.add(new Fresc(checkNumLotList(), new cData(demanarInt("Dia Caducitat"), demanarInt("Mes Caducitat"), demanarInt("Any Caducitat")), demanarString("Pais Origen:"), new cData(demanarInt("Dia embassament"), demanarInt("Mes embassament"), demanarInt("Any Embassament")) ) );
                break;
            case 2:                
                arrayListProductes.add(new Refrigerat( checkNumLotList(), new cData(demanarInt("Dia Caducitat"), demanarInt("Mes Caducitat"), demanarInt("Any Caducitat")), demanarString("Pais Origen:"), new cData(demanarInt("Dia embassament"), demanarInt("Mes embassament"), demanarInt("Any Embassament")), demanarInt("Codi Organisme"), demanarDouble("Temperatura ambient") ) );
                break;
            case 3:
                arrayListProductes.add(new CongelatAire( checkNumLotList(), new cData(demanarInt("Dia Caducitat"), demanarInt("Mes Caducitat"), demanarInt("Any Caducitat")), demanarString("Pais Origen:"), new cData(demanarInt("Dia embassament"), demanarInt("Mes embassament"), demanarInt("Any Embassament")), demanarDouble("Temperatura ambient"), demanarDouble("Percentatge Nitrogen"), demanarDouble("Percentatge Oxigen"), demanarDouble("Percentatge Vapor")));
                break;
            case 4:
                arrayListProductes.add(new CongelatAigua(checkNumLotList(), new cData(demanarInt("Dia Caducitat"), demanarInt("Mes Caducitat"), demanarInt("Any Caducitat")), demanarString("Pais Origen:"), new cData(demanarInt("Dia embassament"), demanarInt("Mes embassament"), demanarInt("Any Embassament")), demanarDouble("Temperatura ambient"), demanarDouble("Salinitat Aigua") ));
                break;
            case 5:
                arrayListProductes.add(new CongelatNitrogen(checkNumLotList(), new cData(demanarInt("Dia Caducitat"), demanarInt("Mes Caducitat"), demanarInt("Any Caducitat")), demanarString("Pais Origen:"), new cData(demanarInt("Dia embassament"), demanarInt("Mes embassament"), demanarInt("Any Embassament")), demanarDouble("Temperatura ambient"), demanarInt( "Metode Congelacio"), demanarDouble("Temps Exposicio Nitrogen") ));
                break;                
        }
    }
    
    public static void mostrarTots() {
        for (Producte prod : arrayListProductes) {
            System.out.println(prod.toString());
        }
    }

    public static void mostrarFiltre() {
        int range = demanarInt("Introdueix el rang de proximitat:");
        cData dataProxim = new cData(demanarInt("Introdueix el dia"), demanarInt("Introdueix el mes"), demanarInt("Introdueix el any"));

        boolean boo = true;
        for (Producte prod : arrayListProductes) {
            if (prod.getDataCaducitat().toDays() <= dataProxim.toDays() + range) {
                System.out.println(prod.toString());
                boo = false;
            }
        }
        if (boo) System.out.println("No s'ha trobat cap valor");
    }

    //eienes del programa, son quasi quasi copypaste d'avions
    public static int demanarOpcio(String pregunta, int max){
        boolean inputCorrecte = false;
        int num = -1;
        while (!inputCorrecte) {
            System.out.println(LS + pregunta);
            if (teclat.hasNextInt() ) {
                num = teclat.nextInt();
                if (num >= 0 && num <= max) {
                    inputCorrecte = true;
                    
                }
                else {
                    System.out.println("El número ha de ser entre 0 i " + max + ".");
                }
            }
            else {
                System.out.println("Introdueix un numero de 0 al " + max + ".");
                teclat.next();
            }
        }
        return num;
    }
    
    public static int demanarInt(String pregunta) {
        boolean inputCorrecte = false;
        int num = -1;
        while (!inputCorrecte) {
            System.out.println(LS + pregunta);
            if (teclat.hasNextInt() ) {
                num = teclat.nextInt();
                if (num >= 0) {
                    inputCorrecte = true;

                }
                else {
                    System.out.println("El número ha de ser més gran de 0.");
                }
            }
            else {
                System.out.println("S'ha d'introduir un número.");
                teclat.next();
            }
        }
        return num;
    }

    public static double demanarDouble(String pregunta) {
        boolean inputCorrecte = false;
        double num = -1;
        while (!inputCorrecte) {
            System.out.println(LS + pregunta);
            if (teclat.hasNextDouble() ) {
                num = teclat.nextDouble();
                if (num >= 0) {
                    inputCorrecte = true;

                }
                else {
                    System.out.println("El número ha de ser més gran de 0.");
                }
            }
            else {
                System.out.println("S'ha d'introduir un número.");
                teclat.next();
            }
        }
        return num;
    }

    public static String demanarString(String pregunta){
        String resposta;        
        System.out.println(LS + pregunta);
        resposta = teclat.next();
        
        return resposta;
    }
    public static int checkNumLotList() {
        int lot = -1;
        boolean boo = true;

        while (boo) {
            lot = demanarInt("Introdueix la nova matrícula: ");

            if (checkNumLotListPosicio(lot) == -1 ) {
                boo = false;
            }
            else {
                System.out.println("La matricula introduida ja existeix");
            }
        }
        return lot;
    }

    public static int checkNumLotListPosicio(int lot) {
        int index = -1;

        for (Producte prod : arrayListProductes) {
            if (prod.getNumLot() == lot) {
                index = arrayListProductes.indexOf(prod);
            }
        }
        return index;
    }
}
