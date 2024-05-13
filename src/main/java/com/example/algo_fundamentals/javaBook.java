package com.example.algo_fundamentals;


import java.util.Scanner;

public class javaBook {

    public static void printMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else{
            System.out.println(b);
    }

}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        printMax( number1, number2);
        int[] list = {1,2,3};

        for (int i=0; i<list.length; i++){
            double singleBookPrice = list[i];
        }

    }
}
