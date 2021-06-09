package com.example.car_gen;

public class Toyota extends Car {
    //private instance fields
    private boolean greatGasMileage;

    Toyota(String color, int year, int speed, int maxSpeed, boolean greatGasMileage) {
        super(color, year, speed, maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }

    public void setGreatGasMileage(boolean newValue) {
        this.greatGasMileage = newValue;
    }

    public boolean getGreatGasMileage(){
        return this.greatGasMileage;
    }
}
