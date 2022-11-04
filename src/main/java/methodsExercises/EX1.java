package methodsExercises;
import java.util.Scanner;

public class EX1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name= sc.nextLine();
        printName(name);

    }
    public static void printName (blah){
        System.out.printf("Hello,%n", blah);
    }

}
