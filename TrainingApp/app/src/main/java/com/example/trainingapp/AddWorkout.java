package com.example.trainingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddWorkout extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_workout);

        findViewById(R.id.addButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.addButton){

            EditText secondsToPass = (EditText) findViewById(R.id.editSeconds);
            String stringToPassBack = secondsToPass.getText().toString();

            EditText workoutToPass = (EditText) findViewById(R.id.writeWorkout);
            String workoutToPassBack = workoutToPass.getText().toString();

            String takaisinMeneva = ("" + stringToPassBack + " " + workoutToPassBack);

            Intent intent = new Intent();
            intent.putExtra(Intent.EXTRA_TEXT, takaisinMeneva);
            setResult(RESULT_OK, intent);
            finish();

        }


    }
}
