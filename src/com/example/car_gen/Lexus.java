package com.example.car_gen;

public class Lexus extends Car {
    private boolean hasLeatherSeats;

    public Lexus(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;

    }

    public Lexus(){
        super();
    }


    public boolean getHasLeatherSeats() {
        return this.hasLeatherSeats;

    }
    public void setHasLeatherSeats() {

    }

}
