package arrays;

/*
 * Given an integer array, return true if any value appears at least twice in the array, and return false
 * if every element is distinct.
 *
 * Example 1:
 *     input: [1,1,1,3,3,4,3,2,4,2]
 *     output: true
 *
 * Example 2:
 *     input: [1,2,3,4]
 *     output: false
 *
 * Example 3:
 *     input: [10,2,1,45,67,32,11,109,209,2,1,10]
 *     output: true
 */

import java.util.HashSet;
import java.util.Set;

public class Array_011_ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = {10, 2, 1, 45, 67, 32, 11, 109, 209, 2, 1, 10};
        boolean containsDuplicateWithHashSet = containsDuplicateWithHashSet(array);
        System.out.println("Contains Duplicate With HashSet: " + containsDuplicateWithHashSet);
        boolean containsDuplicateWithFor = containsDuplicateWithFor(array);
        System.out.println("Contains Duplicate With For: " + containsDuplicateWithFor);
    }

    private static boolean containsDuplicateWithHashSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : array) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    private static boolean containsDuplicateWithFor(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
