package com.example.learningdagger.dagger;

import com.example.learningdagger.pojo.Engine;
import com.example.learningdagger.pojo.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine getPetrolEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }
}
