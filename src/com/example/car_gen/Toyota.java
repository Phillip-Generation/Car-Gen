package com.example.car_gen;

public class Toyota extends Car {

    private boolean greatGasMileage;

    public boolean getGasMileage() {
        return this.greatGasMileage;
    }

    public void setGasMileage(boolean newGasMileage){
        this.greatGasMileage = newGasMileage;
    }

    public Toyota(String color, int year, int speed, int maxSpeed, boolean isElectric, boolean greatGasMileage) {
        super(color, year, speed, maxSpeed, isElectric);
        this.greatGasMileage = greatGasMileage;

    }
}
