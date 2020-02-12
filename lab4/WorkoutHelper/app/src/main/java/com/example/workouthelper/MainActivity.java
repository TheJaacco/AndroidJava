package com.example.workouthelper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, TextToSpeech.OnInitListener {

    int ADD_NEW_PART_INTENT_ID = 8976;

    ArrayList<> fullWorkout = new ArrayList<>();

    TextToSpeech tts = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullWorkout.add(new WorkoutPart(32, "Push ups"));
        fullWorkout.add(new WorkoutPart(15, "Pause"));
        fullWorkout.add(new WorkoutPart(32, "Run"));
        fullWorkout.add(new WorkoutPart(15, "Pause"));

        findViewById(R.id.addNewBtn).setOnClickListener(this);
        findViewById(R.id.speechBtn).setOnClickListener(this);

        tts = new TextToSpeech(this, this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_NEW_PART_INTENT_ID && resultCode == Activity.RESULT_OK)
        {
            WorkoutPart newPart = (WorkoutPart) data.getSerializableExtra("NEW_PART");
            fullWorkout.add(newPart);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.addNewBtn)
        {
            Intent intent = new Intent(this, AddNewWorkoutActivity.class);
            startActivityForResult(intent, ADD_NEW_PART_INTENT_ID );
        }
        else if(v.getId() == R.id.speechBtn)
        {
            tts.speak(fullWorkout.get(0).getName(),TextToSpeech.QUEUE_FLUSH, null);
        }
    }

    @Override
    public void onInit(int status) {

    }
}
