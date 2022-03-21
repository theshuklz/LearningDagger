package com.example.learningdagger.dagger;

import com.example.learningdagger.pojo.DieselEngine;
import com.example.learningdagger.pojo.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    int horsePower;
    public DieselEngineModule(int horsePower){
        this.horsePower = horsePower;
    }

    @Provides
    Engine providesDieselEngine(){
        return new DieselEngine(horsePower);
    }
}
