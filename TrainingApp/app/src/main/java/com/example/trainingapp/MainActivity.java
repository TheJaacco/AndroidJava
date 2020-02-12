package com.example.trainingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int SECOND_ACTIVITY_REQUEST_CODE = 0;
    public static final String EXTRA_MESSAGE = "jotakin";

    ArrayList<WorkoutData> fullWorkout = new ArrayList<>();
    ArrayAdapter<WorkoutData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.addWorkoutBtn).setOnClickListener(this);
        findViewById(R.id.startWorkoutBtn).setOnClickListener(this);

        //fullWorkout.add(new WorkoutData("push ups", 30));
        //adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fullWorkout);

        //TextView myListView = findViewById(R.id.listWorkout);
        //myListView.setAdapter(adapter);



    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.addWorkoutBtn){
            Intent intent = new Intent(this, AddWorkout.class);
            startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE);
        }

        if(v.getId() == R.id.startWorkoutBtn){
            Intent runningIntent = new Intent (this, runningWorkout.class);
            TextView seconds = (TextView) findViewById(R.id.listWorkout);
            String message = seconds.getText().toString();
            runningIntent.putExtra(EXTRA_MESSAGE, message);
            startActivity(runningIntent);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == SECOND_ACTIVITY_REQUEST_CODE){
            if(resultCode == RESULT_OK){

                //WorkoutData newdata = (WorkoutData) data.getSerializableExtra("NEW_PART");
                //fullWorkout.add(newdata);
                //adapter.notifyDataSetChanged();


                String returnString = data.getStringExtra(Intent.EXTRA_TEXT);
                TextView listText = (TextView) findViewById(R.id.listWorkout);
                listText.setText(returnString);

            }
        }
    }
}
