package com.example.learningdagger.pojo;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started");
    }
}
