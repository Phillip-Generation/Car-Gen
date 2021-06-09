
package com.example.car_gen;

public class Toyota extends Car{

    private boolean greatGasMileage;

    Toyota( String model,String color, int year, int speed, int maxSpeed, boolean isElectric, boolean greatGasMileage){
        super("Toyota", model, color, year, speed, maxSpeed, isElectric);
        this.greatGasMileage = greatGasMileage;

    }
    public boolean GreatGasMileage(){
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }
}
