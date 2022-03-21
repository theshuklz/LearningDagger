package com.example.learningdagger.pojo;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started. Horsepower = "+horsePower);
    }
}
