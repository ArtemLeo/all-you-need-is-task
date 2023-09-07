package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * Given an array of integers that contains duplicates as well.
 * Implement the method to find the sum of all unique elements in the array.
 * This problem is also referred to as find the sum of all distinct elements in the array.
 *
 * Example 1:
 *     input: [22,17,35,22,90,17]
 *     output: 164
 *     explanation: Unique elements are 22, 17, 35, 90
 *
 * Example 2:
 *     input: [1,6,4,3,2,2,3,8,1]
 *     output: 24
 *     explanation: Unique elements are 1, 6, 4, 3, 2, 8
 *
 * Example 3:
 *     input: [1,1,3,2,2,3]
 *     output: 6
 *     explanation: Unique elements are 1, 2, 3
 *
 * Example 4:
 *     input: [7,7,7,7]
 *     output: 7
 *     explanation: Only one unique element 7
 */

public class Array_006_SumOfAllUniqueElements {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);

        int sumWithHashSet = sumOfAllUniqueElementsWithHashSet(array);
        System.out.println("Sum of all unique elements with HashSet = " + sumWithHashSet);

        int sumWithFor = sumOfAllUniqueElementsWithFor(array);
        System.out.println("Sum of all unique elements with for loop = " + sumWithFor);
    }

    private static int sumOfAllUniqueElementsWithHashSet(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        int sum = 0;
        for (Integer uniqueCounter : array) {
            if (uniqueElements.add(uniqueCounter)) {
                sum += uniqueCounter;
            }
        }
        return sum;
    }

    private static int sumOfAllUniqueElementsWithFor(int[] array) {
        int sum = 0;
        int[] tempArray = new int[array.length];
        int intCount = 0;
        boolean booleanCount = false;
        for (int number : array) {
            if (intCount == 0) {
                tempArray[0] = number;
                intCount = 1;
                continue;
            }
            for (int i = 0; i < intCount; i++) {
                if (number == tempArray[i]) {
                    booleanCount = true;
                    break;
                }
            }
            if (!booleanCount) {
                tempArray[intCount] = number;
                intCount++;
            }
            booleanCount = false;
        }
        for (int elementNumber : tempArray) {
            sum += elementNumber;
        }
        return sum;
    }

    private static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Random Array: " + Arrays.toString(array));
    }
}
