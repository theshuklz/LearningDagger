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
    int providesHorsePower(){
        return horsePower;
    }
    @Provides
    Engine providesDieselEngine(DieselEngine dieselEngine){
        return dieselEngine;
    }
}
