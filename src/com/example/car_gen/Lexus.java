package com.example.car_gen;

public class Lexus extends Car{
    private boolean hasLeatherSeats;

    public Lexus(String color,int year,int speed ,int maxSpeed,boolean isElectric,boolean hasLeatherSeats ){
        super(color,year,speed,maxSpeed,isElectric);
        this.hasLeatherSeats=hasLeatherSeats;

    }

    public boolean getHasLeatherSeats(){
        return this.hasLeatherSeats;
    }

    public void hasLeatherSeats(boolean hasLeatherSeats){
        this.hasLeatherSeats=hasLeatherSeats;
    }
}
