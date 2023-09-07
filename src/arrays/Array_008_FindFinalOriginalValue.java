package arrays;

/*
 * You are given an array of integers nums.
 * You are also given an integer original which is the first number that needs to be searched for in nums.
 *
 * You then do the following steps:
 *     1.If original is found in nums, multiply it by two (i.e., set original = 2 * original).
 *     2.Otherwise, stop the process.
 *     3.Repeat this process with the new number as long as you keep finding the number.
 * Return the final value of original.
 *
 * Example 1:
 *     input: nums = [5,3,6,1,12], original = 3
 *     output: 24
 *     explanation:
 *     - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
 *     - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
 *     - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
 *     - 24 is not found in nums. Thus, 24 is returned.
 *
 * Example 2:
 *     input: nums = [2,7,9], original = 4
 *     output: 4
 *     explanation:
 *     - 4 is not found in nums. Thus, 4 is returned.
 */

public class Array_008_FindFinalOriginalValue {
    public static void main(String[] args) {
        int[] array = {5, 3, 6, 1, 12, 34, 5, 8, 24, 4, 75, 3, 21, 10};
        int original = 3;
        System.out.println("Original value = " + original);

        int finalOriginalValue = findFinalOriginalValue(array, original);
        System.out.println("FinalOriginalValue = " + finalOriginalValue);

    }

    private static int findFinalOriginalValue(int[] array, int original) {
        System.out.print("Original in for loop: ");
        for (int i : array) {
            if (i == original) {
                original *= 2;
            }
            System.out.print(original + " ");
        }
        System.out.println();
        return original;
    }
}




