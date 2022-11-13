package methodsExercises;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        int myArray[] = {5, 10, 12, 5, 6, 8, 5, 16, 20, 5};
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        System.out.println(numbCounter(numb, myArray));
    }

    public static int numbCounter(int numb, int[] array) {
        int counter = 0;
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == numb) {
                counter++;
            }

        }

        return counter;
    }
}
