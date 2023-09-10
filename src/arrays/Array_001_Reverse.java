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

    private static int[] reverseArrayWithFor(int[] array1) {
        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[array1.length - i - 1] = array1[i];
        }
        return newArray;
    }

    private static int[] reverseArrayWithForEachAndThreeGlasses(int[] array2) {
        for (int i = 0; i < array2.length / 2; i++) {
            int temp = array2[i];
            array2[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = temp;
        }
        return array2;
    }

    private static int[] reverseArrayWithCollectionReverse(int[] array3) {
        Integer[] boxedArray = new Integer[array3.length];
        for (int i = 0; i < array3.length; i++) {
            boxedArray[i] = array3[i];
        }
        Collections.reverse(Arrays.asList(boxedArray));
        int[] newArray = new int[boxedArray.length];
        for (int i = 0; i < boxedArray.length; i++) {
            newArray[i] = boxedArray[i];
        }
        return newArray;
    }
}
