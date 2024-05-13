package com.example.third;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[]{ // declare 1 level array
                6,
                2,
                3
        };

        int[][] matrix = new int[][]{ // declare 2 level array (matrix)
                new int[]{1, 2, 3, 4},
                new int[]{1, 2, 3, 4},
                new int[]{1, 2, 3, 4}
        };

        arr[0] = 1; // set the 0th element of array to the value 1

        int length = arr.length; // declare variable length with value the length of the array

        System.out.println(length);

        for (int i = 0; i < arr.length; i++) { // regular/forward cycle through all elements of array
            int currentElement = arr[i]; // create locally scoped variable with value the element for the current iteration
        }

        for (int i = arr.length - 1; i >= 0; i--) { // backward cycle through all elements of array
            int currentElement = arr[i]; // create locally scoped variable with value the element for the current iteration
        }

        for (int currentElement : arr) { //foreach type loop, same as `for (int i = 0; i < arr.length; i++) {` but doesn't have i variable

        }

        for (int i = 0; i < matrix.length; i++) { // regular/forward cycle through all elements of 2 level array/matrix
            int[] innerArray = matrix[i]; // create locally scoped variable with value the element for the current iteration, which is a row from the matrix

            for (int p = 0; p < innerArray.length; p++) { // regular/forward cycle through all elements of the inner array of a matrix
//                int currentElement = innerArray[p];
//                int currentElement = matrix[i][p];
            }


        }
    }

}
