package com.example.car_gen;

public class Honda extends Car{
    private boolean isTurboCharged;

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }

    public Honda(String color, int year, int speed, int maxSpeed, boolean isTurboCharged) {
        super(color, year, speed, maxSpeed);
        this.isTurboCharged = isTurboCharged;
    }
}
