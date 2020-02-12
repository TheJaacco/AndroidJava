package com.example.ekaoodemo;

public class Pelaaja extends Henkilo {
    private int peliNumero;
    private int maalitKaudessa;

    public int getPeliNumero() {
        return peliNumero;
    }

    public void setPeliNumero(int peliNumero) {
        this.peliNumero = peliNumero;
    }

    public int getMaalitKaudessa() {
        return maalitKaudessa;
    }

    public void setMaalitKaudessa(int maalitKaudessa) {
        this.maalitKaudessa = maalitKaudessa;
    }
}
