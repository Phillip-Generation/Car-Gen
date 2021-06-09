
package com.example.car_gen;

public class Honda extends Car{

    private boolean isTurboCharged;

    Honda(String model,String color,  int year, int speed, int maxSpeed,boolean isElectric, boolean isTurboCharged){
        super("Honda", model, color, year, speed, maxSpeed, isElectric);
        this.isTurboCharged = isTurboCharged;

    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }
}
