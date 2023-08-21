package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Array_001_Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original = " + Arrays.toString(array));

        int[] reverseArray = reverseMethod(array);
        System.out.println("Reverse = " + Arrays.toString(reverseArray));

        int[] reverseArrayWithCollectionReverse = reverseArrayWithCollectionReverse(array);
        System.out.println("ReverseArrayWithCollectionReverse = " + Arrays.toString(reverseArrayWithCollectionReverse));
    }

    private static int[] reverseMethod(int[] arrayFirst) {
        int[] newArray = new int[arrayFirst.length];
        int count = 0;
        for (int i = arrayFirst.length - 1; i >= 0; i--) {
            newArray[count] = arrayFirst[i];
            count++;
        }
        return newArray;
    }

    private static int[] reverseArrayWithCollectionReverse(int[] array) {
        Integer[] boxedArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            boxedArray[i] = array[i];
        }
        Collections.reverse(Arrays.asList(boxedArray));
        for (int i = 0; i < array.length; i++) {
            array[i] = boxedArray[i];
        }
        return array;
    }
}
