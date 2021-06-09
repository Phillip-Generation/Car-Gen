package com.example.car_gen;

public class Toyota extends Car{
    private boolean greatGasMileage;

    public Toyota(String color,int year,int speed ,int maxSpeed,boolean isElectric,boolean greatGasMileage){
        super(color,year,speed,maxSpeed,isElectric);
        this.greatGasMileage=greatGasMileage;

    }
    public boolean getGreatGasMileage(){
        return this.greatGasMileage;
    }
    public void setGreatGasMileage(boolean greatGasMileage){
        this.greatGasMileage=greatGasMileage;
    }
}
