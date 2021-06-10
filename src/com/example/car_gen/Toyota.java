package com.example.car_gen;

public class Toyota extends Car{
    private boolean greatGasMileage;

    /*In your Toyota class, create a constructor which takes
    in the parameters from the parent class and boolean greatGasMileage
     */

    public Toyota(String color, int year, int maxSpeed, boolean greatGasMileage) {
        super(color, year, maxSpeed);
    }
    /* In your Car class, create getters and setters for each instance field.
    Do the same within your Toyota, Lexus, and Honda classes.
     */

    public boolean isGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }


}
