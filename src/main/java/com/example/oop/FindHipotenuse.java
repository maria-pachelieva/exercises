package com.example.oop;

import java.util.Scanner;

public class FindHipotenuse {

    public static void main(String[] args) {
        System.out.println("Enter side a");
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        System.out.println("Enter side b");
        double b = input.nextInt();
        double c = Math.sqrt(a*a+b*b);
        System.out.printf("c = %d", c);
    }
}
