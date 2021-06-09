package com.example.car_gen;

public class Lexus extends Car {
    //private instance fields
    private boolean hasLeatherSeats;

    Lexus(String color, int year, int speed, int maxSpeed, boolean hasLeatherSeats) {
        super(color, year, speed, maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean newValue) {
        this.hasLeatherSeats = newValue;
    }

    public boolean getHasLeatherSeats(){
        return this.hasLeatherSeats;
    }
}
