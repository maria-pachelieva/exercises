package com.example.oop;

// Create a Main class
public class Cat {
    String name;
    int age;

    // Create a class constructor for the Main class
    public Cat() {

    }

    public Cat(String name) {
        this.name = name;

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }




    public static void main(String[] args) {
        Cat myCat = new Cat("Rumen",3);
        System.out.println(myCat.name);
        System.out.println(myCat.age);
    }
}
