package elementary;

/*
  Create a program that takes an integer number and sums its digits.
 */

public class Elementary_003_SumOfDigitsOfNumber {
    public static void main(String[] args) {
        int number = 12345;
        int resultWithFor = findSumOfDigitsOfNumberWithFor(number);
        System.out.println("For: sum of digits of number " + number + " = " + resultWithFor);
        int resultWithWhile = findSumOfDigitsOfNumberWithWhile(number);
        System.out.println("While: sum of digits of number " + number + " = " + resultWithWhile);
    }

    private static int findSumOfDigitsOfNumberWithFor(int number) {
        int sum = 0;
        for (int i = (number > 0 ? number : -1); i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }

    private static int findSumOfDigitsOfNumberWithWhile(int number) {
        int sum = 0;
        int i = (number > 0 ? number : -1);
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
