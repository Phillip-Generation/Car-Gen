package com.example.car_gen;

public class Honda extends Car {

    private boolean isTurboCharged;

    public boolean getTurboCharged() {
        return this.isTurboCharged;
    }

    public void setTurboCharged(boolean newTurboCharged){
        this.isTurboCharged = newTurboCharged;
    }

    public Honda(String color, int year, int speed, int maxSpeed,boolean isElectric, boolean isTurboCharged) {
        super(color, year, speed, maxSpeed, isElectric);
        this.isTurboCharged = isTurboCharged;


    }

}
