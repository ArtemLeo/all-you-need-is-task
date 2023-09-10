package arrays;

/*
 * Write a program that calculates the average value in an array of positive numbers.
 */

public class Array_012_AverageOfPositiveNumbers {
    public static void main(String[] args) {
        int[] array = {10, 2, 1, -45, 67, 32, 11, 109, 209, -2, 1, -10};
        float average = findAverageOfPositiveNumbers(array);
        System.out.println("Average of positive numbers = " + average);
    }

    private static float findAverageOfPositiveNumbers(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                count++;
            }
        }
        return (float) sum / count;
    }
}
