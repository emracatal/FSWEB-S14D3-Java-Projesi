package com.workintech.polymorphism;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String  startEngine(){
        String message = "the car's engine is starting";
        return getClass().getSimpleName() + ": " + message;
    }

    public String  accelerate(){
        String message = "the car is accelerating";
        return getClass().getSimpleName() + ": " + message;
    }

    public String  brake(){
        String message = "the car is braking";
        return getClass().getSimpleName() + ": " + message;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && name.equals(car.name);
    }


}
