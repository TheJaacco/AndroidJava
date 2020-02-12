package com.example.workouthelper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddNewWorkoutActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_workout);

        findViewById(R.id.new_workout_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        WorkoutPart part = new WorkoutPart(30, "Squats");

        Intent resultIntent = new Intent();
        resultIntent.putExtra("NEW_PART", part);
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }
}
