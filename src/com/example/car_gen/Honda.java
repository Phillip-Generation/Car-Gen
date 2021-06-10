package com.example.car_gen;

public class Honda extends Car{
    private boolean isTurboCharged;

    Honda (String color,int year,int speed,int maxSpeed, boolean isTurboCharged) {
        super(color,year,speed,maxSpeed);
        this.isTurboCharged = isTurboCharged;
    }

    public boolean isTurboCharged(){
        return this.isTurboCharged;
    }
     public void setisTurboCharged(boolean isTurboCharged){
        this.isTurboCharged = isTurboCharged;
     }
}
