package com.example.lab_2_3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.suomi).setOnClickListener(this);
        findViewById(R.id.english).setOnClickListener(this);
        findViewById(R.id.sverige).setOnClickListener(this);
        findViewById(R.id.surprise).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView teksti = findViewById(R.id.displayNimi);
        EditText nimi = findViewById(R.id.nimikentta);
        String name = nimi.getText().toString();
        if(v.getId()== R.id.suomi){
            teksti.setText("Tervehdys " +name);
        }
        if(v.getId()== R.id.english){
            teksti.setText("Hello " +name);
        }
        if(v.getId()== R.id.sverige){
            teksti.setText("Hejjsan " +name);
        }
        if(v.getId()== R.id.surprise){
            teksti.setText("Cheeki breeki blyat " +name);
        }
    }
}
