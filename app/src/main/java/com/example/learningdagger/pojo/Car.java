package com.example.learningdagger.pojo;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "car";

    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    /**
     * This method can't be private else dagger can't call it.
     * We use method constructor here as "this" is not ready yet
     */
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drives "+this);
    }
}
