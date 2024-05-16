package metodsNakovBookExercise;

import java.util.Scanner;

public class LastNumberName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double last = lastNumber(number);
        //printNumber(last);
    }

    public static void lastNumber(double number) {
        double lastN = 0;
        if (number > 10) {
            lastN = number - Math.floor(number / 10);
        } else {
            lastN = number;
        }
        System.out.println(lastN);
        //return lastN;
    }
    //public static void printNumber(int number) {

    //}

}



