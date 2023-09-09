package elementary;

/*
 Create a program that converts the temperature in Fahrenheit to Celsius;
 */

public class Elementary_002_TemperatureFahrenheitToCelsius {
    public static void main(String[] args) {
        // from Fahrenheit to Celsius;
        double fahrenheit = 41;
        double fromFahrenheitToCelsius = calculateFromFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " F = " + fromFahrenheitToCelsius + " C");

        // from Celsius to Fahrenheit;
        double celsius = 41;
        double fromCelsiusToFahrenheit = calculateFromCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " C = " + fromCelsiusToFahrenheit + " F");
    }

    private static double calculateFromCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double calculateFromFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
