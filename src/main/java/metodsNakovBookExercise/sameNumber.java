package metodsNakovBookExercise;

import java.util.Scanner;

public class sameNumber {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 9, 16, 2, 6, 7, 3, 8, 4,8,9,9,9};
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        numberOfTimes(arr,number);
    }

    public static void numberOfTimes(int[] a, int numb) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (numb == a[i]){
                counter++;
            }
        }
        System.out.println(counter);
    }

}
