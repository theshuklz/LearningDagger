package com.example.learningdagger.dagger;

import com.example.learningdagger.pojo.DieselEngine;
import com.example.learningdagger.pojo.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindDieselEngine(DieselEngine dieselEngine);
}
