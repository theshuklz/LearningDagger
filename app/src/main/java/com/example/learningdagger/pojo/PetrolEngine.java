package com.example.learningdagger.pojo;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{

    private final int horsePower;
    private final int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsepower") int horsePower,@Named("enginecapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started. HorsePower = " + horsePower
        + " ,engineCapacity = " +engineCapacity);
    }
}
