package arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * Given an integer array, return the length of the longest continuous increasing subsequence.
 * The subsequence must be strictly increasing.
 *
 * Example 1:
 *     input: [1,3,5,4,7]
 *     output: 3
 *     explanation: The longest continuous increasing subsequence is [1,3,5]
 *
 * Example 2:
 *     input: [50, 3, 10, 15, 22, 90, 20, 71]
 *     output: 5
 *     explanation: The longest continuous increasing subsequence is [3,10,15,22,90]
 *
 * Example 3:
 *     input: [10,9,2,5,3,7,101,18]
 *     output: 3
 *     explanation: The longest continuous increasing subsequence is [3,7,101]
 *
 * Example 4:
 *     input: [2,2,2,2,2]
 *     output: 1
 *     explanation: The longest continuous increasing subsequence is [2]
 */

public class Array_005_LongestIncreasingContinuesSubsequence {
    public static void main(String[] args) {
        int[] array = new int[20];
        fillArray(array);

        int easyVariation = easyFindLongestIncreasingContinuesSubsequence(array);
        System.out.println("Easy variation = " + easyVariation);

        int hardVariation = hardFindLongestIncreasingContinuesSubsequence(array);
        System.out.println("Hard variation = " + hardVariation);
    }

    private static int easyFindLongestIncreasingContinuesSubsequence(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        return maxLength;
    }

    private static int hardFindLongestIncreasingContinuesSubsequence(int[] array) {
        int variableA = -1;
        int variableB = 1;
        if (array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] && variableA == -1) {
                variableA = i;
            }
            if (array[i] >= array[i + 1] && variableA != -1) {
                int currentLength = i - variableA + 1;
                if (variableB < currentLength) {
                    variableB = currentLength;
                }
                variableA = -1;
            }
            if (i + 1 == array.length - 1 && array[i] < array[i + 1]) {
                if (variableA == -1) {
                    variableA = i;
                }
                int currentLength = i + 1 - variableA + 1;
                if (variableB < currentLength) {
                    variableB = currentLength;
                }
                variableA = -1;
            }
        }
        return variableB;
    }

    private static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(3);
        }
        System.out.println("Random Array: " + Arrays.toString(array));
    }
}
