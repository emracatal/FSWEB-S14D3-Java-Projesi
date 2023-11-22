package com.workintech.polymorphism;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super( cylinders, name);
    }

    public String  startEngine(){
        String message = "Holden's engine is starting";
        return getClass().getSimpleName() + ": " + message;
    }

    public String  accelerate(){
        String message = "Holden is accelerating";
        return getClass().getSimpleName() + ": " + message;
    }

    public String  brake(){
        String message = "Holden is braking";
        return getClass().getSimpleName() + ": " + message;
    }
}
