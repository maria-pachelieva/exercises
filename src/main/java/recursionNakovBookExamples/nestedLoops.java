package recursionNakovBookExamples;

import java.util.Scanner;

public class nestedLoops {
    public static int numberOfLoops;
    public static int numberOfIterations;
    public static int[] loops;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        loops = new int[numberOfLoops];
        nestedLoops(0);

    }
    public static void nestedLoops(int currentLoop){
        if(currentLoop == numberOfLoops){
            printLoops();
            return;
        }
        for (int counter = 1;counter <= numberOfIterations;counter++){
            loops [currentLoop]=counter;
            nestedLoops(currentLoop+1);
        }


    }
    public static void printLoops(){
        for (int i = 0; i<numberOfLoops;i++){
            System.out.printf("%d",loops[i]);
        }
        System.out.println();

    }
}
