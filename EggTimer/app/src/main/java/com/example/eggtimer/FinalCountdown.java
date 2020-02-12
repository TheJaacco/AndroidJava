package com.example.eggtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.EditText;
import android.widget.TextView;

public class FinalCountdown extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_countdown);

        Intent intent = getIntent();
        final String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        int mesClock = Integer.parseInt(message);
        mp = MediaPlayer.create(this, R.raw.elephant);

        new CountDownTimer(mesClock*1000, 1000){
            TextView clockka = findViewById(R.id.clock);
            public void onTick(long millisUntilFinished){
                clockka.setText("TIME: " +millisUntilFinished / 1000);
            }

            @Override
            public void onFinish(){
                clockka.setText("DONE!");
                mp.start();
                finish();
            }
        }.start();
    }
}
