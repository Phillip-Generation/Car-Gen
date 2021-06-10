package com.example.car_gen;

public class Lexus extends Car{
    private boolean hasLeatherSeats;

     /* In your Lexus class,create a constructor which takes
    in the  parameters from the parent class and boolean hasLeatherSeats*/

    public Lexus(String color, int year, int maxSpeed, boolean hasLeatherSeats) {
      super(color, year, maxSpeed);
    }
    /* In your Car class, create getters and setters for each instance field.
    Do the same within your Toyota, Lexus, and Honda classes.
     */

    public boolean isHasLeatherSeats() {
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }



}
