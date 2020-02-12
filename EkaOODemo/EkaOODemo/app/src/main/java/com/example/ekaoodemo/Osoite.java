package com.example.ekaoodemo;

public class Osoite {

    String lahiOsoite;
    String kaupunki;
    String maa;
    String postinumero;

    public Osoite(String lahiOsoite, String kaupunki, String maa, String postinumero) {
        this.lahiOsoite = lahiOsoite;
        this.kaupunki = kaupunki;
        this.maa = maa;
        this.postinumero = postinumero;
    }

    public String getLahiOsoite() {
        return lahiOsoite;
    }

    public void setLahiOsoite(String lahiOsoite) {
        this.lahiOsoite = lahiOsoite;
    }

    public String getKaupunki() {
        return kaupunki;
    }

    public void setKaupunki(String kaupunki) {
        this.kaupunki = kaupunki;
    }

    public String getMaa() {
        return maa;
    }

    public void setMaa(String maa) {
        this.maa = maa;
    }

    public String getPostinumero() {
        return postinumero;
    }

    public void setPostinumero(String postinumero) {
        this.postinumero = postinumero;
    }
}
