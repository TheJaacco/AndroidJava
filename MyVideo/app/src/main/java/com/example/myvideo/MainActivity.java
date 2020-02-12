package com.example.myvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn1){
            Intent intent1 =new Intent(this, VideoViewClass.class);
            startActivity(intent1);
            Log.d("Activity2", "start on view");
        }
        if(v.getId() == R.id.btn2){
            Intent intent2 = new Intent(this, MediaPlayerClass.class);
            startActivity(intent2);
        }
    }
}
