package com.example.car_gen;

class Lexus extends Car {
    /**
     * Whether or not the Lexus has leather seats
     */
    private boolean hasLeatherSeats;

    /**
     * Constructor
     *
     * @param color The car's color
     * @param year The car's year
     * @param speed The car's current speed
     * @param maxSpeed The car's maximum speed
     * @param hasLeatherSeats If the Lexus has leather seats
     */
    public Lexus(String color, int year, int speed, int maxSpeed, boolean hasLeatherSeats) {
        // Call the Car constructor
        super(color, year, speed, maxSpeed);

        // Set the hasLeatherSeats property
        this.hasLeatherSeats = hasLeatherSeats;
    }

    /**
     * Check if the car has leather seats
     *
     * @return If the car has leather seats
     */
    public boolean getHasLeatherSeats() {
        return this.hasLeatherSeats;
    }

    /**
     * Set if the car has leather seats
     *
     * @param hasLeatherSeats If the car has leather seats
     */
    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
