package com.example.car_gen;

public class Honda extends Car {
    //private instance fields
    private boolean isTurboCharged;

    Honda(String color, int year, int speed, int maxSpeed, boolean isTurboCharged) {
        super(color, year, speed, maxSpeed);
        this.isTurboCharged = isTurboCharged;
    }

    public void setIsTurboCharged(boolean newValue) {
        this.isTurboCharged = newValue;
    }

    public boolean getIsTurboCharged(){
        return this.isTurboCharged;
    }
}
