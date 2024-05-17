package metodsNakovBookExercise;

import java.util.Scanner;

public class LastNumberName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int last = lastNumber(number);
        //System.out.println(last);
        printNumber(last);
    }

    public static int lastNumber(int number) {
        int lastN = number % 10;
        return lastN;
    }

    public static void printNumber(int number) {
        String numberName = "";
        switch (number) {
            case 0:
                numberName = "zero";
                break;
            case 1:
                numberName = "one";
                break;
            case 2:
                numberName = "two";
                break;
            case 3:
                numberName = "three";
                break;
            case 4:
                numberName = "four";
                break;
            case 5:
                numberName = "five";
                break;
            case 6:
                numberName = "six";
                break;
            case 7:
                numberName = "seven";
                break;
            case 8:
                numberName = "eight";
                break;
            case 9:
                numberName = "nine";
                break;
            default:
                System.out.println("Error!");
                break;

        }
        System.out.println(numberName);

    }

}



