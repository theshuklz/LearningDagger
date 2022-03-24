package com.example.learningdagger.dagger;

import com.example.learningdagger.pojo.Rims;
import com.example.learningdagger.pojo.Tires;
import com.example.learningdagger.pojo.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * making this class abstract ensures that only static methods can be added here.
 * Also, dagger doesn't instantiate this module so more optimized.
 */
@Module
public abstract class WheelsModule {


    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }

}
