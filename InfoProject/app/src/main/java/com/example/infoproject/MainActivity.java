package com.example.infoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        Spinner spin = findViewById(R.id.spinner);
        String maat[] = {"Suomi", "Tarkov", "Murica fuk yea", "Ruåtti"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, maat);
        spin.setAdapter(adapter);
        CheckBox ice = findViewById(R.id.checkBox);
        ice.setText("I like icecream");
    }

    @Override
    public void onClick(View v) {
        RadioGroup ryhma = findViewById(R.id.radioGroup);
        Spinner spin = findViewById(R.id.spinner);
        EditText name = findViewById(R.id.EditName);
        String nimi = name.getText().toString();
        String ika = " ";
        String jaatelo = " ";

            if(v.getId() == R.id.button){

                CheckBox checkBox = findViewById(R.id.checkBox);
                if (checkBox.isChecked()){
                    jaatelo = "and I like jäde\n";
                }
                else {
                    jaatelo = "and I don't like jäätelö\n";}
            if(ryhma.getCheckedRadioButtonId() == R.id.radioButton){
                ika = " olen 0-20v vanha ";
            }
            if(ryhma.getCheckedRadioButtonId() == R.id.radioButton2) {
                ika = "olen 21-49 vanha ";
            }
            if(ryhma.getCheckedRadioButtonId() == R.id.radioButton3) {
                ika = "olen yli 50 vuotias";

            }
            TextView teksti = findViewById(R.id.finalTextView);
            teksti.setText("Hei minä olen: " +nimi);
            teksti.append(" " + ika);
            teksti.append(" " + jaatelo);
            teksti.append("asun maassa: " +spin.getSelectedItem().toString());
        }
    }
}
