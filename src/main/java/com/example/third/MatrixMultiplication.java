package com.example.third;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MatrixMultiplication {

    public static void main(String[] args) {
        // Declare input data
        int[][] matrix = new int[][]{
                new int[]{1, 5, 6, 8},
                new int[]{4, 1, 8, 10},
                new int[]{3, 5, 6, 1},
                new int[]{7, 8, 9, 2}
        };

        // Solution/Algorithm
        int result = 1;

        for (int i = 0; i < matrix.length; i++) {
            result = result * matrix[i][i];

        }

        //Map Iterator
        Map<Integer, Integer> sameNumberCounter = new HashMap<>();
        Iterator<Map.Entry<Integer, Integer>> iter = sameNumberCounter.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<Integer, Integer> entry = iter.next();
            Integer entryKey = entry.getKey();
        }

        // String methods
        var asd = "dsa";
        if (asd.endsWith("a")) {

        }

        new String().endsWith("a");

        "".endsWith("a");
    }
}
