package com.example;

public class CarSatelliteRadioDecorator extends CarDecorator{
    public CarSatelliteRadioDecorator(Car car){
        super(car);
    }
    @Override
    public String display() {
        return car.display() + "; with satellite radio";
    }
}
