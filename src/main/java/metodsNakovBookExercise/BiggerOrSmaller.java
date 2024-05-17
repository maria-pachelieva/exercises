package metodsNakovBookExercise;

import java.util.Scanner;

public class BiggerOrSmaller {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 8, 323, 2, 87, 2, 1, 5, 1};
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        check(arr, n);

    }

    public static void check(int arr[], int n) {
        if (arr[n] > arr[n - 1] && arr[n] > arr[n + 1]) {
            System.out.println("It's bigger");
        }
        else if (arr[n] < arr[n - 1] && arr[n] < arr[n + 1]) {
            System.out.println("It's smaller");
        } else {
            System.out.println("Neither");
        }

    }
}

