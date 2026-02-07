package com.example;

public abstract class CarDecorator implements Car {
    Car car;
    protected CarDecorator(Car car) {
        this.car = car;
    }
}

