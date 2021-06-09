
package com.example.car_gen;

public class Honda extends Car{

    private boolean isTurboCharged;

    Honda(String model,String color,  int year,int maxSpeed, boolean isTurboCharged){
        super("Honda", model, color, year, maxSpeed);
        this.isTurboCharged = isTurboCharged;

    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }
}
