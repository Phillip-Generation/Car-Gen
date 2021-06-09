package com.example.car_gen;

public class Lexus extends Car{
   private boolean hasLeatherSeats;

   public Lexus(String color, int year, int speed,int maxSpeed, boolean hasLeatherSeats) {
      super(color, year, speed, maxSpeed, hasLeatherSeats);

   }
   public boolean setHasLeatherSeats(){
      return hasLeatherSeats;
   }
   public void setHasLeatherSeats(boolean hasLeatherSeats){
      this.hasLeatherSeats = hasLeatherSeats;
   }
}
