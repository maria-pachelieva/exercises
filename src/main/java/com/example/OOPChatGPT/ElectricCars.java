package com.example.OOPChatGPT;

 public class ElectricCars extends Car{
private double batteryCapacity;

     public ElectricCars(double batteryCapacity,String make,String model, int year) {
         super(make,model,year);
         this.batteryCapacity = batteryCapacity;
     }

 }
