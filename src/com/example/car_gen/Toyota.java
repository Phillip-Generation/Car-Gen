package com.example.car_gen;

class Toyota extends Car {
    /**
     * Whether or not the Toyota has great gas mileage
     */
    private boolean greatGasMileage;

    /**
     * Constructor
     *
     * @param color           The car's color
     * @param year            The car's year
     * @param speed           The car's current speed
     * @param maxSpeed        The car's maximum speed
     * @param greatGasMileage If the car has great gas mileage
     */
    public Toyota(String color, int year, int speed, int maxSpeed, boolean greatGasMileage) {
        // Call the Car constructor
        super(color, year, speed, maxSpeed);

        // Set the greatGasMileage property
        this.greatGasMileage = greatGasMileage;
    }

    /**
     * Get if the car has great mileage
     *
     * @return If the car has great mileage
     */
    public boolean getGreatGasMileage() {
        return this.greatGasMileage;
    }

    /**
     * Set if the car has great gas mileage
     *
     * @param greatGasMileage If the car has great gas mileage
     */
    public void setGreatGasMileage(boolean greatGasMilage) {
        this.greatGasMileage = greatGasMileage;
    }
}
