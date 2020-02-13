package com.example.trainingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class runningWorkout extends AppCompatActivity {

    ArrayList<WorkoutData> sentWorkouts;
    TextView workoutName = (TextView) findViewById(R.id.workoutTitle);
    TextView timeLeft = (TextView) findViewById(R.id.timeTitle);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_workout);

        sentWorkouts = (ArrayList<WorkoutData>) getIntent().getSerializableExtra(MainActivity.EXTRA_MESSAGE);


        workoutName.setText(sentWorkouts.get(0).getWorkoutName());
        timeLeft.setText(Integer.toString(sentWorkouts.get(0).getTime()));

        workOutTimer(sentWorkouts.get(0).getTime());
    }
        public void workOutTimer(int time)
        {
        new CountDownTimer(time*1000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                long timer = millisUntilFinished/1000;
                timeLeft.setText(Long.toString(timer));

            }

            @Override
            public void onFinish() {
                workoutName.setText("DONE");

            }
        }.start();
    }
}
