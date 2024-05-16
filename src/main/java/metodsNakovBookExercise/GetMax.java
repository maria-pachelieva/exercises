package metodsNakovBookExercise;

import java.util.Scanner;

public class GetMax {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        getMax(number1,number2,number3);

    }
    public static void getMax(int num1,int num2,int num3){
        System.out.println(Math.max(num3,(Math.max(num1,num2))));


    }
}
