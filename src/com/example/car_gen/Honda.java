package com.example.car_gen;

public class Honda extends Car {

    private boolean isTurboCharged;

    public Honda(boolean isTurboCharged) {
        this.isTurboCharged = isTurboCharged;

    }

    public Honda() {
        super();
    }

    public boolean getIsTurboCharged() {
        return this.isTurboCharged;

    }
    public void setIsTurboCharged() {

    }

}
