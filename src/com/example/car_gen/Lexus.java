
package com.example.car_gen;

public class Lexus extends Car{

    private boolean hasLeatherSeats;

    Lexus(String model,String color,  int year, int speed, int maxSpeed,boolean isElectric, boolean hasLeatherSeats){
        super("Lexus",model, color, year, speed, maxSpeed, isElectric);
        this.hasLeatherSeats = hasLeatherSeats;

    }

    public boolean isHasLeatherSeats() {
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
