package com.example.lab_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ArrayList<String> countries = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.add_button).setOnClickListener(this);
        findViewById(R.id.edit_button).setOnClickListener(this);
        findViewById(R.id.remove_button).setOnClickListener(this);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);

        countries.add("Suomi");
        countries.add("Tarkov");
        countries.add("Ruåtti");
        countries.add("Viro");

        ListView myListView = findViewById(R.id.country_list_view);
        myListView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
    EditText editor = findViewById(R.id.text_editor);

        if(v.getId() == R.id.add_button){
            //editor.getText().toString();
            countries.add(editor.getText().toString());
            adapter.notifyDataSetChanged();
            editor.setText(null);
        }
        if(v.getId() == R.id.remove_button) {
            countries.remove(editor.getText().toString());
            adapter.notifyDataSetChanged();
            editor.setText(null);
        }
    }
}
