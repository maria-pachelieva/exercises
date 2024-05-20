package metodsNakovBookExercise;

import java.util.Scanner;

public class NumberBackwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        int chisloto = input.nextInt();
        backwards(number);
        bakwSecondSolution(chisloto);

    }

    public static void backwards(String number) {
        String backNum = new String("");
        char ch;
        for (int i = 0; i < number.length(); i++) {
            ch = number.charAt(i);
            backNum = ch + backNum;
        }
        //  for (int a = 0; a < number.length(); a++) {
        //     backNum.charAt(a) = number.charAt(i);
        //  }
        // }
        System.out.println(backNum);

    }

    public static void bakwSecondSolution(int numb2) {

        while (numb2 > 0) {
            int next = numb2 % 10;
            numb2 = numb2/10 ;
            System.out.print(next);
        }

    }

}
