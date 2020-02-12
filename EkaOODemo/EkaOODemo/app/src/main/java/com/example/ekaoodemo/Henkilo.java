package com.example.ekaoodemo;

import android.util.Log;

public class Henkilo {

    private String nimi;
    private String hetu;
    private Osoite henkilonOsoite;

    public Osoite getHenkilonOsoite() {
        return henkilonOsoite;
    }

    public void setHenkilonOsoite(Osoite henkilonOsoite) {
        this.henkilonOsoite = henkilonOsoite;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        if (nimi == null || nimi.length() == 0)
        {
            Log.d("OAMK-DEMO", "EI SAA OLLA NULLI!");
            throw new IllegalArgumentException();
        }
        this.nimi = nimi;
    }

    public String getHetu() {
        return hetu;
    }

    public void setHetu(String hetu) {
        this.hetu = hetu;
    }

    public String kerroItsestasi() {
        return "HENKILO: " + getNimi();
    }
}
