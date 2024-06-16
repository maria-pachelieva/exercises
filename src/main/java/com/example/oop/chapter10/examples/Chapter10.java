package com.example.oop.chapter10.examples;

import com.example.oop.chapter10.Cat;

public class Chapter10 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Cat newCat = new Cat();
            newCat.setName("Cat" + i);
            newCat.sayMiau();
        }
        System.out.println();
    }
}
