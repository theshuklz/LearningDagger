package com.example.learningdagger.pojo;

import javax.inject.Inject;

//Assuming we don't own this class so we can't use @Inject here
public class Wheels {

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
