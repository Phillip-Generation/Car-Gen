package com.example.car_gen;

public class Lexus extends Car {
    private boolean hasLeatherSeats;

    Lexus(String color, int year, int speed, int maxSpeed, boolean hasLeatherSeats, boolean isElectric){
        super(color, year, speed, maxSpeed, isElectric);
        this.hasLeatherSeats = hasLeatherSeats;
    }

    public boolean hasLeatherSeats(){
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean isTurboCharged) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
