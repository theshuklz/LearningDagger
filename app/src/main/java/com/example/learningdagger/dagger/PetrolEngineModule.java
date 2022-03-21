package com.example.learningdagger.dagger;

import com.example.learningdagger.pojo.Engine;
import com.example.learningdagger.pojo.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine petrolEngine);
}
