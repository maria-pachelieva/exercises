package methodsExercises;

import java.util.Scanner;

public class EX3 {
    public static void main(new String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        printLastNumber(number);
    }

    public static void printLastNumber(int num) {
        int lastDigid = num % 10;
        String name = "";
        switch (lastDigid){

            case 1:
                name = "one";
            case 2:
                name = "two";
            case 3:
                name = "tree";
            case 4:
                name = "four";
            case 5:
                name = "five";
            case 6:
                name = "six";
            case 7:
                name = "seven";
            case 8:
                name = "eight";
            case 9:
                name = "nine";
            case 0:
                name = "zero";
        }
        System.out.println(name);
    }
}
