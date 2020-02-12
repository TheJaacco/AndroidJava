package com.example.trainingapp;

import java.io.Serializable;

public class WorkoutData implements Serializable {

    private String workoutName;
    private int time;

    public WorkoutData(String workoutName, int time){
        this.workoutName = workoutName;
        this.time = time;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
