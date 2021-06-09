package com.example.car_gen;

//created a class and instances
public class Car {

   private String color;
   private int year;
   private int speed = 0;
   private int maxSpeed;
   private boolean isElectric;

//constructor
   public Car(String color, int year, int maxSpeed) {
      this.color = color;
      this.year = year;
      this.maxSpeed  = maxSpeed;

   }

   //method

   public void accelerateSpeed() {
      if(this.speed +5 > this.maxSpeed){
         System.out.println("Can't exceed max speed");}
        else this.speed += 5;
      }

   public void decelerateSpeed() {
      if(this.speed >= 5) {
         this.speed -= 5;
      } else if (this.speed < 5){
         this.speed = 0;
      }
   }
   public void convertToElectric() {
      if(this.isElectric){
         System.out.println("Already Electric");
      }else{this.setElectric(true);}
   }

   //getters and setters

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getSpeed() {
      return speed;
   }

   public void setSpeed(int speed) {
      this.speed = speed;
   }

   public int getMaxSpeed() {
      return maxSpeed;
   }

   public void setMaxSpeed(int maxSpeed) {
      this.maxSpeed = maxSpeed;
   }

   public boolean isElectric() {
      return isElectric;
   }

   public void setElectric(boolean electric) {
      isElectric = electric;
   }


}


