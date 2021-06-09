package com.example.car_gen;

public class Honda extends Car {
    private boolean isTurboCharged;

    public Honda(String color, int year, int speed, int maxSpeed, boolean isTurboCharged){
        super(color, year, speed, maxSpeed, "Honda");
        this.isTurboCharged = isTurboCharged;
    }

    public boolean getIsTurboCharged(){
        return this.isTurboCharged;
    }

    public void setIsTurboCharged(boolean isTurbo){
        this.isTurboCharged = isTurbo;
    }
}
