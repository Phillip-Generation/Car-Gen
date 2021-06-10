package com.example.car_gen;

public class Toyota extends Car  {

    public static com.example.car_gen.Car Car;
    private boolean greatGasMileage;

    public Toyota(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;

    }
    public Toyota(){
        super();
    }

    public boolean getGreatGasMileage() {
        return this.greatGasMileage;

    }
    public void setGreatGasMileage() {

    }


}
