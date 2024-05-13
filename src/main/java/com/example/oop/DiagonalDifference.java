package com.example.oop;

public class DiagonalDifference {
    public static void main(String[] args) {

        int[][] arr = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12},
        };
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row == col) {
                    sumDiagonal1 += arr[row][col];
                }

                if ((row + col) == arr.length-1) { //????
                    sumDiagonal2 += arr[row][col];
                    System.out.println(sumDiagonal2);
                }
            }
        }
        System.out.println(sumDiagonal1);

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = arr[row].length-1; col >= 0; col--)
//                if (row == col) {
//                    sumDiagonal2 += arr[row][col];
////                    System.out.println(arr[row][col]);
//                }
//        }
        System.out.println(sumDiagonal2);
    }
}
