package com.example.trainingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
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
        EditText secondsToPass = (EditText) findViewById(R.id.editSeconds);
        EditText workoutToPass = (EditText) findViewById(R.id.writeWorkout);

        if(v.getId() == R.id.addButton){
            WorkoutData newWorkout = new WorkoutData(workoutToPass.getText().toString(), Integer.parseInt(secondsToPass.getText().toString()));
            Intent intentReturn = new Intent();
            intentReturn.putExtra("NEW_PART", newWorkout);
            setResult(Activity.RESULT_OK, intentReturn);
            finish();

        }


    }
}
