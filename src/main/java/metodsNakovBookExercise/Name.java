package metodsNakovBookExercise;

import java.util.Scanner;

public class Name {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String name = input.nextLine();
        printName(name);



    }
    public static void printName (String name){
        System.out.printf("Hello %s!",name);
    }
}
