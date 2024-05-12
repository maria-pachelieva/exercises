package com.example.algo_fundamentals;

public class metodVar {
    public static void main(String[] args) {
        long sum1 = calcElements(2,5);
        System.out.println(sum1);

        long sum2 = calcElements(3, 4, 5, 8, 6);
        System.out.println(sum2);

        long sum3 = calcElements(8, 7, 2, 2, 69, 1);
        System.out.println(sum3);

    }

    public static long calcElements(int... elements) {
        long sum = 0;
        for (int i = 0; i < elements.length; i++) {
            long number = elements[i];
            sum += number;
        }
        return sum;
    }
}
