package com.example.car_gen;

public class Lexus extends Car {
    private boolean hasLeatherSeats;

    public Lexus(String color, int year, int speed, int maxSpeed, boolean hasLeatherSeats){
        super(color, year, speed, maxSpeed, "Lexus");
        this.hasLeatherSeats = hasLeatherSeats;
    }

    public boolean getHasLeatherSeats(){
        return this.hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeather){
        this.hasLeatherSeats = hasLeather;
    }
}
