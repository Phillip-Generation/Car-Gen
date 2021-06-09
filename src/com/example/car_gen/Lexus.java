package com.example.car_gen;

public class Lexus extends Car{
    private boolean hasLeatherSeats;

    public Lexus(String color, int year, int speed, int maxSpeed, boolean isElectric, boolean hasLeatherSeats) {
        super(color, year, speed, maxSpeed, isElectric);
    }

    public boolean isHasLeatherSeats() {
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
