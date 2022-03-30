package com.example.learningdagger.dagger;

import com.example.learningdagger.MainActivity;
import com.example.learningdagger.pojo.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
//Creates and stores our objects and provides them to us
public interface CarComponent {

    Car getMyFancyCar();

    //We cannot use the superclass here as in super of MainActivity.
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horsepower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("enginecapacity") int engineCapacity);

        CarComponent build();
    }
}
