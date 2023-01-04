package recursion.Exercises;

import java.util.Scanner;

public class Dog {
    private String name;

    public Dog() {
        this.name = "Sharo";
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.printf("Dog %s said: Wow-wow!%n", name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write first dog's name: ");
        String firstDogName = input.nextLine();
        Dog firstDog = new Dog(firstDogName);
        System.out.print("Write second dog's name: ");
        Dog secondDog = new Dog();
        secondDog.setName(input.nextLine());
        Dog thirdDog = new Dog();

        Dog[] dogs = new Dog[]{firstDog, secondDog, thirdDog};
        for (Dog dog:dogs){
            dog.bark();
        }

    }
}



