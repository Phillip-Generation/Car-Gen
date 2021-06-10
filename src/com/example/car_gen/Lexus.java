package com.example.car_gen;

public class Lexus extends Car{
    private boolean hasLeatherSeats;

    Lexus (String color, int year,int speed, int maxSpeed,boolean hasLeatherSeats) {
        super(color,year, speed ,maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;
    }

    public boolean hasLeatherSeats(){
        return this.hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
