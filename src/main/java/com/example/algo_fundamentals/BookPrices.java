package com.example.algo_fundamentals;

public class BookPrices {

    public static void main(String[] args) {
        double[] prices = new double[]{2.5, 5, 36, 7};
        printTotalAmountBooks(prices);

    }

    public static void printTotalAmountBooks(double[] prices) {
        double totalPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            double singlePrice = prices[i];
            totalPrice += singlePrice;
        }
        System.out.println("Total price is " + totalPrice);

    }
}
