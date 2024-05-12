package com.example.algo_fundamentals;

import java.util.Scanner;

public class HoursValidation {
    public static void main(String[] args) {
        System.out.println("What time is it ?");
        System.out.println("Enter hours = ");
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        System.out.println("Enter minutes = ");
        int minutes = input.nextInt();

        boolean validTime = validateHours(hours) && validateMinutes(minutes);
        if (validTime) {
           // System.out.println("YAAAA");
            System.out.printf("The time is %d:%d now %n", hours, minutes);
        } else {
            System.out.println("Incorrect time");
        }
    }

    public static boolean validateHours(int hours) {
        boolean result = (hours >= 0 && hours < 24);
        return result;
    }


    public static boolean validateMinutes(int minutes) {
        boolean result = (minutes >= 0 && minutes <= 59);
        return result;

    }
}
