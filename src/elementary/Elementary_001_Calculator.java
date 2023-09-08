package elementary;

/*
 Create a program that adds/multiplies/subtracts/divide two numbers and displays the result.
 */

public class Elementary_001_Calculator {
    public static void main(String[] args) {
        int firstValue = 10;
        int secondValue = 5;
        String operation = "*";
        int result = calculateValues(firstValue, secondValue, operation);
        System.out.println(firstValue + " " + operation + " " + secondValue + " = " + result);
    }

    private static int calculateValues(int firstValue, int secondValue, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                if (secondValue != 0) {
                    result = firstValue / secondValue;
                } else {
                    System.out.println("Error: Division by zero is allowed!");
                }
        }
        return result;
    }
}
