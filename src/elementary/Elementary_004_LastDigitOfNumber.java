package elementary;

/*
  Determine whether the last digit of the number is the digit "3" or "72".
 */

import java.util.Scanner;

public class Elementary_004_LastDigitOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        boolean firstResult = ifLastDigitOfNumberEquals3(firstNumber);
        boolean secondResult = ifLastDigitOfNumberEquals72(secondNumber);
        System.out.println("The last digit of number " + firstNumber + " equals 3? -> " + firstResult);
        System.out.println("The last digit of number " + secondNumber + " equals 72? -> " + secondResult);
    }

    private static boolean ifLastDigitOfNumberEquals3(int firstNumber) {
        if (firstNumber % 10 == 3) {
            return true;
        }
        return false;
    }

    private static boolean ifLastDigitOfNumberEquals72(int secondNumber) {
        if (secondNumber % 100 == 72) {
            return true;
        }
        return false;
    }
}
