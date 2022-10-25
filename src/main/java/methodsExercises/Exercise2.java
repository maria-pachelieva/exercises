package methodsExercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int topMax = 1;
        int currentMax = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                currentMax++;
                if (topMax < currentMax) {
                    topMax = currentMax;
                }
            } else {
                currentMax = 1;
            }
        }


        System.out.printf("%d%n", topMax);
    }
}
