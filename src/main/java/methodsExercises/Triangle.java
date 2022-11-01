package methodsExercises;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        System.out.print("n=");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println();

        for (int line = 1; line <= n; line++) {
        printLine(1,line);
        }
        for (int line = 1; line <= n; line++) {
            printLine(1,line);
        }

    }
} private static void printLine (int start,int end){
    for (int i=start;i<= end; i++ ){
        System.out.print(" " + i);
    }
    System.out.println();

 }}
