package com.workintech.polymorphism;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String  startEngine(){
        String message = "Ford's engine is starting";
        return getClass().getSimpleName() + ": " + message;
    }

    public String  accelerate(){
        String message = "Ford is accelerating";
        return getClass().getSimpleName() + ": " + message;
    }

    public String  brake(){
        String message = "Ford is braking";
        return getClass().getSimpleName() + ": " + message;
    }

}
