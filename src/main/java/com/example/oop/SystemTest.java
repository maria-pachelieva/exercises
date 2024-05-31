package com.example.oop;

public class SystemTest {
    public static void main(String[] args) {
        int sum = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sum++;
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("The time elapsed is %f sec", endTime - startTime / 1000.0);
    }

}
