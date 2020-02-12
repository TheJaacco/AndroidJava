package com.example.trainingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class runningWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_workout);

        Intent intent = getIntent();
        final String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        int mesClock = Integer.parseInt(message);

        new CountDownTimer(mesClock*1000, 1000){
            TextView clock = findViewById(R.id.timeTitle);
            public void onTick(long millisUntilFinished){
                clock.setText("Time remaining: " +millisUntilFinished / 1000);

            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
