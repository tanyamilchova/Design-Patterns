package com.example;

public class CarNavigationDecorator extends CarDecorator {
    public CarNavigationDecorator(Car car){
        super(car);
    }
    @Override
    public String display() {
        return car.display() + "; with navigation";
    }
}
