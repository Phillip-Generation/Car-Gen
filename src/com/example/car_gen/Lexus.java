package com.example.car_gen;

public class Lexus extends Car {

    private boolean hasLeatherSeats;

    public boolean getLeatherSeats() {
        return this.hasLeatherSeats;
    }

    public void setLeatherSeats(boolean newLeatherSeats){
        this.hasLeatherSeats = newLeatherSeats;
    }

    public Lexus(String color, int year, int speed, int maxSpeed, boolean isElectric, boolean hasLeatherSeats) {
        super(color, year, speed, maxSpeed, isElectric);
        this.hasLeatherSeats = hasLeatherSeats;

    }
}
