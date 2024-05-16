package com.example.algo_fundamentals;

public class SortingNumbers {
    public static void main(String[] args) {
        int[] numbers = sort(10, 3, 5, -1, 0, 12, 8);
        printNumbers(numbers);

    }

    public static int[] sort(int... numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int tempVar = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempVar;

                }
            }

        }

        return numbers;
    }

    public static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d", numbers[i]);
            if (i < (numbers.length) - 1) {
                System.out.printf(",");
            }
        }

    }

}
