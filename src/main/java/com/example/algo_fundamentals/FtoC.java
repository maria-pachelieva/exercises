package com.example.algo_fundamentals;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        System.out.println("Enter temp in F");
        Scanner input = new Scanner(System.in);
        double tempF = input.nextDouble();
        double temperature = tempConverter(tempF);
        System.out.printf("Your body temperature in C is %f%n", temperature);
        if (temperature >= 37) {
            System.out.println("You are ill");
        }

    }

    public static double tempConverter(double tempF) {
        double tempC = (tempF - 32) * 5 / 9;
        return tempC;
    }
}
