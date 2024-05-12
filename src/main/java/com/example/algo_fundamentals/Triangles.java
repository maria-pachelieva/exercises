package com.example.algo_fundamentals;

import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {
        System.out.println("Enter n=");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println();

        for (int i = 1; i <= n ; i++) {
            printLine(1, i);
        }

        for (int a = n - 1; a >= 1; a--) {
            printLine(1, a);
        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
