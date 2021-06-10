package com.example.car_gen;

public class Honda extends Car{
    private boolean isTurboCharged;


    /* In your Honda class, create a constructor which takes
    in the parameters from the parent class and boolean isTurboCharged
     */
    public Honda(String color, int year, int maxSpeed, boolean isTurboCharged) {
        super(color, year, maxSpeed);
    }

    /* In your Car class, create getters and setters for each instance field.
    Do the same within your Toyota, Lexus, and Honda classes.
     */

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }

}