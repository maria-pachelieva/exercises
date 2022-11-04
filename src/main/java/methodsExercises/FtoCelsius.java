package methodsExercises;



import java.util.Scanner;

public class FtoCelsius {
    public static double convertFahrenreitToCelsius(double temperatureF){

    double temperatureC = (temperatureF - 32) * 5 / 9;
    return temperatureC;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter your temp in Fahrenheit degrees: ");
        double temperature = input.nextDouble();
        temperature = convertFahrenreitToCelsius(temperature);
        System.out.printf("Your body temp in C is %f.%n", temperature);

        if (temperature >= 37) {
            System.out.print("You are ill");

        }
        input.close();
    }
}
