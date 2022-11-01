package com.example.arrays;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int maxLength = 1;
        int currentLength = 1;
        int[] arrayCurrent = new int[n];
        int[] arrayMax = new int[n];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                currentLength++;
                //   arrayCurrent[i] = array[i];
                if (maxLength < currentLength) {
                    maxLength = currentLength;
                }
            } else currentLength = 1;

        }

        System.out.print(arrayMax);

        for (double singleBookPrice : prices) {
            totalAmount += singleBookPrice;
        }


        for (int i = 0; i<prices.length; i++) {
            double singleBookPrice = prices[i];







            totalAmount += singleBookPrice;
        }


    }
}