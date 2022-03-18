package com.example.learningdagger.dagger;

import com.example.learningdagger.pojo.Car;

import dagger.Component;

@Component
//Creates and stores our objects and provides them to us
public interface CarComponent {

    Car getMyFancyCar();

}
