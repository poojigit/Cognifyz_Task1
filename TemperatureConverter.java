import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Designed By Poojisha Lakshya");
        System.out.print("Enter the temperature value: ");
        double temperatureValue = scanner.nextDouble();
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        char unitInput = scanner.next().charAt(0);


        double convertedValue;
        char convertedUnit;

        if (unitInput == 'C' || unitInput == 'c') {
            // Convert Celsius to Fahrenheit
            convertedValue = (temperatureValue * 9/5) + 32;
            convertedUnit = 'F';
        } else if (unitInput == 'F' || unitInput == 'f') {
            // Convert Fahrenheit to Celsius
            convertedValue = (temperatureValue - 32) * 5/9;
            convertedUnit = 'C';
        } else {
            System.out.println("Invalid unit of measurement. Please use 'C' for Celsius or 'F' for Fahrenheit.");
            scanner.close();
            return;
        }


        System.out.printf("The converted temperature is %.2f°%c.%n", convertedValue, convertedUnit);


        scanner.close();
    }
}