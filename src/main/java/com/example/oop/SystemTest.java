package com.example.oop;

public class SystemTest {
    public static void main(String[] args) {
        int sum = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 40; i++) {
            sum++;
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("The time elapsed is %d msec", endTime - startTime);
    }

}
