package com.example.oop.chapter10;

// Create a Main class
public class Cat {
    private String name;
    private String colour;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {

        return this.colour;
    }

    public Cat() {
        this.name = "Unnamed";
        this.colour = "gray";
    }

    public Cat(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void sayMiau() {
        System.out.printf("Cat %s said: Miauuuuuuu!%n", name);
    }

}
