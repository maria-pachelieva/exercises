package com.example.oop.chapter10;

public class Sequence {
    private static int currentValue = -1;

    private Sequence() {

    }

    public static int nextValue() {
        return ++currentValue;
    }
}
