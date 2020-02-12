package com.example.externalactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.openMap).setOnClickListener(this);
        findViewById(R.id.createCall).setOnClickListener(this);
        findViewById(R.id.goBTN).setOnClickListener(this);
        img1 = findViewById(R.id.kuva);
        img1.setImageResource(R.drawable.oamklogo);
    }

    @Override
    public void onClick(View v){
        EditText textField = findViewById(R.id.editText);
        String osoite = textField.getText().toString();

        if(v.getId() == R.id.openMap) {
            Uri map = Uri.parse("geo:65.0605433,25.461546?z=17");
            Intent openMap = new Intent(Intent.ACTION_VIEW, map);
            startActivity(openMap);

        }
        if(v.getId() == R.id.createCall){
            Uri number = Uri.parse("tel:0206110200");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        }
        if(v.getId() == R.id.goBTN){
            Uri go = Uri.parse("http:" + osoite);
            Intent goIntent = new Intent(Intent.ACTION_VIEW, go);
            startActivity(goIntent);

        }

    }

}

