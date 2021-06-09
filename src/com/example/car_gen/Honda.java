package com.example.car_gen;

public class Honda extends Car{
    private boolean isTurboCharged;

    public Honda(String color,int year,int speed ,int maxSpeed,boolean isElectric,boolean isTurboCharged){
        super(color,year,speed,maxSpeed,isElectric);
        this.isTurboCharged=isTurboCharged;

    }
    public boolean getIsTurboCharged(){
        return this.isTurboCharged;
    }
    public void isTurboCharged(boolean isTurboCharged){
        this.isTurboCharged=isTurboCharged;
    }
}
