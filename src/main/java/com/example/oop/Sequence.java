package com.example.oop;

public class Sequence {
    private static int currentValue = -1;
    private Sequence(){

    }
    public static int nextValue(){
        currentValue++;
        return currentValue;
    }
}
