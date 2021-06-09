package com.example.car_gen;

public class Toyota extends Car{
    private boolean greatGasMileage;

    public Toyota(String color, int year, int speed, int maxSpeed, boolean isElectric, boolean greatGasMileage) {
        super(color, year, speed, maxSpeed, isElectric);
    }

    public boolean isGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }
}
