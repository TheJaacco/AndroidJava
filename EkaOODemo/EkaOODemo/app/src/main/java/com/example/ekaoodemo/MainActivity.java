package com.example.ekaoodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OODemotus();

        final Button btn = findViewById(R.id.nappula);
        btn.setText("Hui hai");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setText("Mukavaa");
            }
        });
    }

    private void OODemotus() {
        Osoite osoite = new Osoite("Pihlajakatu 4", "HKI", "Suomi", "00100" );
        Osoite osoite2 = new Osoite("Pihlajakatu 4", "HKI", "Suomi", "00100" );

        Henkilo sepi = new Henkilo();
        sepi.setNimi("Seppo Taalasmaa");
        sepi.setHenkilonOsoite(osoite);

        Henkilo ulla = new Henkilo();
        ulla.setNimi("Ulla Taalasmaa");
        ulla.setHenkilonOsoite(osoite2);

        Pelaaja piukki = new Pelaaja();
        piukki.setNimi("Pikku");
        piukki.setMaalitKaudessa(34);
        piukki.setPeliNumero(32);

        Henkilo ismo = new Henkilo();

        Tuomari nurmio = new Tuomari();
        nurmio.setRooli("Video");
        nurmio.setNimi("Nurmio");

        ArrayList<Henkilo> kaikkiSiistitTyypit = new ArrayList<>();
        kaikkiSiistitTyypit.add(piukki);
        kaikkiSiistitTyypit.add(ulla);
        kaikkiSiistitTyypit.add(sepi);
        kaikkiSiistitTyypit.add(nurmio);

        TextView text = findViewById(R.id.textView);

        for (int i = 0; i < kaikkiSiistitTyypit.size(); i++) {
            text.append(kaikkiSiistitTyypit.get(i).kerroItsestasi() + "\n");
        }
    }
}
