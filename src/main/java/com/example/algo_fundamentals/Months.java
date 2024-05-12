package com.example.algo_fundamentals;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        System.out.print("Enter first month = ");
        Scanner input = new Scanner(System.in);
        int firstMonth = input.nextInt();
        System.out.print("Enter second month = ");
        int secondMonth = input.nextInt();
        sayPeriod(firstMonth, secondMonth);
        //input.close();


    }

    public static void sayMonth(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Error!");
                break;
        }
        System.out.print(monthName);


    }
    public static void sayPeriod(int first,int second){
        int difference = 0;
        if (first <= second){
            difference = second - first;
        } else  {
            difference = (12 - first) + second;
        }
        System.out.print("There is");
        System.out.print(difference);
        System.out.print("months period between");
        sayMonth(first);
        System.out.print("to");
        sayMonth(second);
        System.out.print(".");
    }
}
