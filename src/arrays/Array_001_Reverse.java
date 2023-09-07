package arrays;

import java.util.Arrays;
import java.util.Collections;

/*
 * Given an array, the task is to reverse the given array.
 *
 * Example 1:
 *     input : [1,2,3,4,5]
 *     output: [5,4,3,2,1]
 *
 * Example 2:
 *     input : [280,345,1,280,1]
 *     output: [1,280,1,345,280]
 */

public class Array_001_Reverse {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original = " + Arrays.toString(array1));
        int[] reverseArrayWithFor = reverseArrayWithFor(array1);
        System.out.println("ReverseArrayWithFor = " + Arrays.toString(reverseArrayWithFor));
        System.out.println("-----------------------------------------");

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original = " + Arrays.toString(array2));
        int[] reverseArrayWithForEachAndThreeGlasses = reverseArrayWithForEachAndThreeGlasses(array2);
        System.out.println("ReverseArrayWithForEachAndThreeGlasses = " + Arrays.toString(reverseArrayWithForEachAndThreeGlasses));
        System.out.println("-----------------------------------------");

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original = " + Arrays.toString(array3));
        int[] reverseArrayWithCollectionReverse = reverseArrayWithCollectionReverse(array3);
        System.out.println("ReverseArrayWithCollectionReverse = " + Arrays.toString(reverseArrayWithCollectionReverse));
        System.out.println("-----------------------------------------");
    }

    private static int[] reverseArrayWithFor(int[] arrayFirst) {
        int[] newArray = new int[arrayFirst.length];
        int count = 0;
        for (int i = arrayFirst.length - 1; i >= 0; i--) {
            newArray[count] = arrayFirst[i];
            count++;
        }
        return newArray;
    }

    private static int[] reverseArrayWithForEachAndThreeGlasses(int[] array) {
        int[] newArray = new int[array.length];
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    private static int[] reverseArrayWithCollectionReverse(int[] array) {
        Integer[] boxedArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            boxedArray[i] = array[i];
        }
        Collections.reverse(Arrays.asList(boxedArray));
        int[] newArray = new int[boxedArray.length];
        for (int i = 0; i < boxedArray.length; i++) {
            newArray[i] = boxedArray[i];
        }
        return newArray;
    }
}
