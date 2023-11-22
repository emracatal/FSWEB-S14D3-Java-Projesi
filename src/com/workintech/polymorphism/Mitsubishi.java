package com.workintech.polymorphism;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String  startEngine(){
        super.startEngine();
        String message = "Mitsubishi's engine is starting";
        return getClass().getSimpleName() + ": " + message;
    }

    public String  accelerate(){
        super.accelerate();
        String message = "Mitsubishi is accelerating";
        return getClass().getSimpleName() + ": " + message;
    }

    public String  brake(){
        super.brake();
        String message = "Mitsubishi is braking";
        return getClass().getSimpleName() + ": " + message;
    }
}
