package com.example.learningdagger.pojo;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{

    private final int horsePower;

    @Inject
    public PetrolEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started. HorsePower = " + horsePower);
    }
}
