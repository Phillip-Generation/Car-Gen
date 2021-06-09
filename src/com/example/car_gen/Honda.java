package com.example.car_gen;

public class Honda extends Car {
    private boolean isTurboCharged;

    Honda(String color, int year, int speed, int maxSpeed, boolean isTurboCharged, boolean isElectric){
        super(color, year, speed, maxSpeed, isElectric);
        this.isTurboCharged = isTurboCharged;
    }

    public boolean isTurboCharged(){
        return isTurboCharged;
    }

    public void isTurboCharged(boolean isTurboCharged) {
        this.isTurboCharged = isTurboCharged;
    }
}
