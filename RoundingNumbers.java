// RoundingNumbers.java
// author majid amiri 28.12.2024
import java.util.Scanner;
public class RoundingNumbers
{

    // prompt the user to enter a number
    public static void main(String[]args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        System.out.printf("Original value: %f%n", number);
        System.out.printf("The number rounded to the nearest integer: %.0f%n", roundToInteger(number));
        System.out.printf("The number rounded to the nearest tenth: %.1f%n", roundToTenths(number));
        System.out.printf("The number rounded to the nearest hundredth: %.2f%n", roundToHundredths(number));
        System.out.printf("The number rounded to the nearest thousandth: %.3f%n", roundToThousandths(number));

    }

    // calculate and return rounded value to the nearest integer
    public static double roundToInteger(double x)
    {
        return Math.floor(x + 0.5);
    }

    // calculate and return rounded value to the nearest tenths
    public static double roundToTenths(double x)
    {
        return Math.floor(x * 10 + 0.5) / 10;
    }

    // calculate and return rounded value to the nearest hundredths
    public static double roundToHundredths(double x)
    {

        return Math.floor(x * 100 + 0.5) / 100;
    }

    // calculate and return rounded value to the nearest thousandth
    public static double roundToThousandths(double x)
    {

        return Math.floor(x * 1000 + 0.5) / 1000;
    }
}