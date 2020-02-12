package com.example.animalsounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.imageView1);
        img2 = findViewById(R.id.imageView2);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
        img1.setImageResource(R.drawable.bear);
        img2.setImageResource(R.drawable.lamb);
        img3.setImageResource(R.drawable.elephant);
        img4.setImageResource(R.drawable.wolf);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView1){
            mp = MediaPlayer.create(this, R.raw.bear);
            mp.start();
        }
        if (v.getId() == R.id.imageView2){
            mp = MediaPlayer.create(this, R.raw.lamb);
            mp.start();
        }
        if (v.getId() == R.id.imageView3){
            mp = MediaPlayer.create(this, R.raw.elephant);
            mp.start();
        }
        if (v.getId() == R.id.imageView4){
            mp = MediaPlayer.create(this, R.raw.wolf);
            mp.start();
        }

    }
}

