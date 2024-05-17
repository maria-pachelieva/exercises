package metodsNakovBookExercise;

import java.util.Scanner;

public class NumberBackwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        backwards(number);
    }

    public static String backwards(String number) {
        String back = new String("");
        for (int i = number.length(); i >= 0; i--) {
            back.charAt(0) = number.charAt(i);
        }
        return back;
    }
}
