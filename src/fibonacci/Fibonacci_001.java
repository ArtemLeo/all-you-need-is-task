package fibonacci;

/*
 Create a program that displays Fibonacci numbers up to a specified number.
 */

public class Fibonacci_001 {
    public static int n1 = 0, n2 = 1, n3 = 0;
    public static int i1 = 0, i2 = 1, i3 = 0;

    public static void main(String[] args) {
        int limit = 50;

        System.out.print("Fibonacci Numbers With While: " + n1 + " " + n2 + " ");
        displayFibonacciNumbersWithWhile(limit);
        System.out.println();

        System.out.print("Fibonacci Numbers With Recursion: " + i1 + " " + i2 + " ");
        displayFibonacciNumbersWithRecursion(limit);
    }

    private static void displayFibonacciNumbersWithWhile(int limit) {
        while (n3 < limit) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 < limit) {
                System.out.print(n3 + " ");
            }
        }
    }

    private static void displayFibonacciNumbersWithRecursion(int limit) {
        i3 = i1 + i2;
        i1 = i2;
        i2 = i3;
        if (i3 < limit) {
            System.out.print(i3 + " ");
            displayFibonacciNumbersWithRecursion(limit);
        }
    }
}

