package com.example.OOPChatGPT;

import com.example.oop.chapter10.Cat;

public class CarTest {

    public static void main (String[] args) {
        Car myCar = new Car("BMW", "5", 1998);
        Car newerCar = new Car("Honda", "Civic", 2000);
        ElectricCars newTesla = new ElectricCars(30,"Tesla","model S",2025);

        myCar.displayInfo();
        newerCar.displayInfo();
    }
}
