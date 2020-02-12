package com.example.ekaoodemo;

public class Tuomari extends Henkilo {
    private String rooli;

    public String getRooli() {
        return rooli;
    }

    public void setRooli(String rooli) {
        this.rooli = rooli;
    }

    @Override
    public String kerroItsestasi() {
        return "MINA OLEN TUOMARI, MINA MÄÄRÄÄN! " + getNimi();
    }
}
