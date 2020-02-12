package com.example.eggtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_MESSAGE = "jotakin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.startTimer).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.startTimer){
            Intent countdown = new Intent(this, FinalCountdown.class);
            EditText seconds = (EditText) findViewById(R.id.editTime);
            String message = seconds.getText().toString();
            countdown.putExtra(EXTRA_MESSAGE, message);
            startActivity(countdown);
        }
    }
}
