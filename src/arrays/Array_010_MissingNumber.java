package arrays;

/*
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * Example 1:
 *     input: nums = [3,0,1]
 *     output: 2
 *     explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 *     2 is the missing number in the range since it does not appear in nums.
 *
 * Example 2:
 *     input: nums = [0,1]
 *     output: 2
 *     explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
 *     2 is the missing number in the range since it does not appear in nums.
 *
 * Example 3:
 *     input: nums = [9,6,4,2,3,5,7,0,1]
 *     output: 8
 *     explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
 *     8 is the missing number in the range since it does not appear in nums.
 */

public class Array_010_MissingNumber {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 2, 3, 5, 7, 8, 1, 11, 0};
        int withArithmeticProgression = findMissingNumberWithArithmeticProgression(array);
        System.out.println("WithArithmeticProgression = " + withArithmeticProgression);
        int withBubbleSort = findMissingNumberWithBubbleSort(array);
        System.out.println("WithBubbleSort = " + withBubbleSort);
    }

    private static int findMissingNumberWithArithmeticProgression(int[] array) {
        int expectedSum = array.length * (array.length + 1) / 2;
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }

    private static int findMissingNumberWithBubbleSort(int[] array) {
        int variableValue;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        variableValue = array[0];
        for (int number : array) {
            if (variableValue != number) {
                return variableValue;
            }
            variableValue++;
        }
        if (array[0] == 0) {
            return array[array.length - 1] + 1;
        }
        return 0;
    }
}
