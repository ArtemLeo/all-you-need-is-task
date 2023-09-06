package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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
