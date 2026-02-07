package com.example;

public class Demo {
    public static void main(String[] args) {
        Car plainCar = new PlainCar();
        Car navigationCar = new CarNavigationDecorator(plainCar);
        Car sateliteRadioCar = new CarSatelliteRadioDecorator(plainCar);
        Car navigationRadioCar = new CarNavigationDecorator(sateliteRadioCar);
        System.out.println(plainCar.display());
        System.out.println(navigationCar.display());
        System.out.println(sateliteRadioCar.display());
        System.out.println(navigationRadioCar.display());
    }
}
