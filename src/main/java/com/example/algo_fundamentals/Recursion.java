package com.example.algo_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }


    }
}
