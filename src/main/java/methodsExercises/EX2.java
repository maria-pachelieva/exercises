package methodsExercises;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = input.nextInt();
        System.out.println("Enter number 2:");
        int number2 = input.nextInt();

        getMax(number1, number2, );

    }

    public static void getMax(int num1, int num2,) {
        System.out.println(Math.max(num1, num2));


    }
}
