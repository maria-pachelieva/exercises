package methodsExercises;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = input.nextInt();
        System.out.println("Enter number 2:");
        int number2 = input.nextInt();
        getMax(number1, number2);

    }

    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            System.out.printf("Max = %d", num1);
            else if (num1 < num2) {
                System.out.printf("Max = %d", num2);
                else{
                    System.out.printf("Numbers are equal.");
                }
            }
        }

    }
}
