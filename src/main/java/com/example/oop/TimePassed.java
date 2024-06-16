package com.example.oop;

public class TimePassed {
    public static void main(String[] args) {
        long timePassed = System.currentTimeMillis();
        System.out.printf("Time ellapsed is %d%n", timePassed);
        long timePassedInMin = timePassed / 60000;

        long days = timePassedInMin / 1440;
        System.out.printf("Days are %d%n", days);
        long hours = (timePassed - days)/60;
        System.out.printf("Hours are %d%n", hours);
        long minutes = 0;
        System.out.printf("Minutes are %d%n", minutes);
    }


}
