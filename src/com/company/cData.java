package com.company;

public class cData {

    private int day;
    private int month;
    private int year;

    public cData (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public int toDays() {
        return this.day + this.month * 30 + this.year * 12 * 30;
    }

}
