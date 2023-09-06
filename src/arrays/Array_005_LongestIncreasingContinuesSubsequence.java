package arrays;

import java.util.Arrays;
import java.util.Random;

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
