package com.example.second;

public class CountDigits {


    public static void main(String[] args) {
        int n = 1000;
        int counter = 0;


        for (; ; ) {
            counter = counter + 1;
            n = n / 10;

            if (n == 0) {
                break;
            }
        }


        System.out.println(counter);
    }

}
