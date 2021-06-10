package com.example.car_gen;

class Car {
    /**
     * The color of the car
     */
    private String color;

    /**
     * The year of the car
     */
    private int year;

    /**
     * The car's current speed
     */
    private int speed;

    /**
     * The car's maximum speed
     */
    private int maxSpeed;

    /**
     * Whether or not the car is electric
     */
    private boolean electric;

    /**
     * Constructor
     *
     * @param color The car's color
     * @param year The car's year
     * @param speed The car's current speed
     * @param maxSpeed The car's maximum speed
     */
    public Car(String color, int year, int speed, int maxSpeed) {
        // Set the object properties
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    /*
      +============================+
      | Getters for Car properties |
      +============================+
     */

    /**
     * Get the car's color
     *
     * @return The car's color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Get the car's year
     *
     * @return The car's year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Get the car's current speed
     *
     * @return The car's current speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Get the car's maximum speed
     *
     * @return The car's maximum speed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /*
      +============================+
      | Setters for Car properties |
      +============================+
     */

    /**
     * Set the car's color
     *
     * @param color The car's color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Set the car's year
     *
     * @param year The car's year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Set the car's speed
     *
     * @param The car's speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Set the car's maximum speed
     *
     * @param The car's maximum speed
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Accelerate the car by five MPH
     */
    public void accelerateSpeed() {
        // Check if we're below the maximum speed
        if (this.speed + 5 <= this.maxSpeed) {
            this.speed += 5;
        } else {
            // Otherwise, set to the maximum speed
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Decelerate the car by five MPH
     */
    public void decelerateSpeed() {
        // Check if we're above 0
        if (this.speed - 5 >= 0) {
            this.speed -= 5;
        } else {
            // Otherwise, set the speed to 0
            this.speed = 0;
        }
    }

    /**
     * Make the car electric
     */
    public void convertToElectric() {
        // If the car is already electric, display an error message
        if (this.electric == true) {
            System.out.println("The car is already electric.");
        } else {
            // Otherwise, make the car electric
            this.electric = true;
        }
    }
}
