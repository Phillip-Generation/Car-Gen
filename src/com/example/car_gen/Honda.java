package com.example.car_gen;

class Honda extends Car {
    /**
     * Whether or not the Honda is turbo charged
     */
    private boolean isTurboCharged;

    /**
     * Constructor
     *
     * @param color    The car's color
     * @param year     The car's year
     * @param speed    The car's current speed
     * @param maxSpeed The car's maximum speed
     * @param isTurboCharged If the Honda is turbo charged
     */
    public Honda(String color, int year, int speed, int maxSpeed, boolean isTurboCharged) {
        // Call the Car constructor
        super(color, year, speed, maxSpeed);

        // Set the isTurboCharged property
        this.isTurboCharged = isTurboCharged;
    }

    /**
     * Get if the car is turbo charged
     *
     * @return If the car is turbo charged
     */
    public boolean getIsTurboCharged() {
        return this.isTurboCharged;
    }

    /**
     * Set if the car is turbo charged
     *
     * @return If the car is turbo charged
     */
    public void setIsTurboCharged(boolean isTurboCharged) {
        this.isTurboCharged = isTurboCharged;
    }
}
