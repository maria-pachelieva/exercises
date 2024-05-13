package com.example.oop;

import java.util.ArrayList;
import java.util.Collections;

public class ComparisonSort {


    public static void main(String[] args) {
        ArrayList<Integer> sort = new ArrayList<>(Collections.nCopies(100, 0));

//        for (int i = 0; i <= 100; i++) {
//            sort.add(0);
//        }
//        Collections.fill(sort, 0);

        //  for (int i=0; i<sort.size();i++){
        //  System.out.println(sort.get(i));
        //}

        //System.out.println(sort.get(100));

        ArrayList<Integer> toSort = new ArrayList<>();
        toSort.add(1);
        toSort.add(1);
        toSort.add(3);
        toSort.add(2);
        toSort.add(1);

        //int counter = 0;
        for (int a = 0; a < toSort.size(); a++) {
            int index = toSort.get(a);
            sort.set(index, sort.get(index) + 1);


        }
        System.out.println(sort);
    }
}
