package com.example.OOPChatGPT;

public class Car {
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return this.make;
    }

    public void setMake() {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel() {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear() {
        this.year = year;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.printf("Car info: %s, %s, %d %n", make, model, year);
    }
}
