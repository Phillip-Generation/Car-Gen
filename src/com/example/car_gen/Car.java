package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean  isElectric;

    public Car(String color, int year, int speed, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        }
    //  getters and setters for Color

        public String getColor() {
        return this.color;
        }
        public void setColor (String colorOfCar) {
            this.color = colorOfCar;
        }
    //  getters and setters for Year
        public int getYear() {
            return this.year;
        }
        public void setYear(int yearOfCar) {
            this.year = yearOfCar;
        }
    //  getters and setters for Speed

        public int getSpeed() {
        return this.speed;
        }
         public void setSpeed(int carSpeed) {
        this.speed = carSpeed;
        }
    //  getters and setters for MaxSpeed

        public int getMaxSpeed() {
            return maxSpeed;
        }
        public void setMaxSpeed(int maxSpeedOfCar) {
            this.maxSpeed = maxSpeedOfCar;
        }

    //  accelerateSpeed method

        public void accelerateSpeed(){
            this.speed += 5;
            if (speed > maxSpeed){
                System.out.println("You can not exceed the maximum speed: " + this.maxSpeed);
            }
        }
    //  decelerateSpeed method
    public void decelerateSpeed(){
        this.speed -= 5;
        if (speed <= 0){
            System.out.println("You are now at 0MPH");
        }
    }
    //  getters and setters for IsElectric
    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    //  convertToElectric method
    public void convertToElectric(){
        if (this.isElectric){
            System.out.println("This car is already electric.");
        }else{
            this.setElectric(true);
        }
    }


    }

