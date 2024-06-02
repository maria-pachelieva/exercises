package recursionNakovBookExamples;

import java.util.Scanner;

public class VariationPrint {
    public static int n;
    public static int length;
    public static int[] combination;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n =");
        n = input.nextInt();
        System.out.println("Enter k =");
        length = input.nextInt();
        combination = new int[length];
        whereTheMagicHappens(0);

    }

    public static void whereTheMagicHappens(int numb) {
        if (numb == length) {
            print();
            return;
        }
        for (int i = 1; i <= n; i++) {
            combination[numb] = i;
            whereTheMagicHappens(numb + 1);
        }
    }

    public static void print() {
        System.out.print("(");
        for (int a = 0; a < length; a++) {
            if(a>0){
            System.out.print(" ");
        }
            System.out.printf("%d", combination[a]);


        }
        System.out.print("),");
    }
}
