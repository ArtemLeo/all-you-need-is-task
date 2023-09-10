package arrays;

/*
 * Write a program that finds the intersection in two arrays of numbers.
 */

import java.util.Arrays;

public class Array_013_IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 7, 30, 5, 70, 44, 19};
        int[] array2 = {19, 4, 25, 17, 28, 99, 30, 70, 1, 93};
        int[] duplicateArray = displayIntersectionTwoArrays(array1, array2);
        System.out.println("Duplicate Array: " + Arrays.toString(duplicateArray));
    }

    private static int[] displayIntersectionTwoArrays(int[] array1, int[] array2) {
        int[] duplicateArray = new int[array1.length + array2.length];
        int count = 0;
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    System.out.println("Duplicate is done: " + i);
                    duplicateArray[count] = i;
                    count++;
                }
            }
        }
        return duplicateArray;
    }
}
