package arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 *     input: [0,10,0,0,12,0,15]
 *     output: [10,12,15,0,0,0,0]
 *
 * Example 2:
 *     input: [345,0,12,12,0,78,0]
 *     output: [345,12,12,78,0,0,0]
 */

public class Array_007_MoveZeroesValuesToTheEnd {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);

        int[] moveZeroesValuesFirstVariation = moveZeroesValuesFirstVariation(array);
        System.out.println("moveZeroesValues First Variation: " + Arrays.toString(moveZeroesValuesFirstVariation));

        int[] moveZeroesValuesSecondVariation = moveZeroesValuesSecondVariation(array);
        System.out.println("moveZeroesValues Second Variation: " + Arrays.toString(moveZeroesValuesSecondVariation));
    }

    private static int[] moveZeroesValuesFirstVariation(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[count] = array[i];
                count++;
            }
        }
        for (int i = count; i < array.length; i++) {
            array[count] = 0;
            count++;
        }
        return array;
    }

    private static int[] moveZeroesValuesSecondVariation(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] == 0) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }
        System.out.println("Random Array: " + Arrays.toString(array));
    }
}
