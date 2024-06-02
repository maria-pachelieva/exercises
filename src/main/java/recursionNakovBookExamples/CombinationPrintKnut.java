package recursionNakovBookExamples;

import java.util.Scanner;

public class CombinationPrintKnut {
    public static int n;
    public static int length;
    public static int[] combination;
    public static int topLevelI = 1;

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
        for (int i = topLevelI; i <= n; i++) {
            combination[numb] = i;
            whereTheMagicHappens(numb + 1);

            if (numb == 0) {
                topLevelI++;
            }
        }
    }

    public static void print() {
        System.out.print("(");
        for (int a = 0; a < length; a++) {

            if (a > 0) {
                System.out.print(" ");
            }
            System.out.printf("%d", combination[a]);


        }
        System.out.print("),");
    }
}
