package com.example.learningdagger.dagger;

import com.example.learningdagger.MainActivity;
import com.example.learningdagger.pojo.Car;

import dagger.BindsInstance;
import dagger.Component;

@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
//Creates and stores our objects and provides them to us
public interface CarComponent {

    Car getMyFancyCar();

    //We cannot use the superclass here as in super of MainActivity.
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(int horsePower);
        CarComponent build();
    }
}
