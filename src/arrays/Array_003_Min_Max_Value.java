package arrays;


import java.util.Arrays;

public class Array_003_Min_Max_Value {
    public static void main(String[] args) {
        int[] array = {92, 60, 71, 83, 2, 43, 96, 72, 79, 44};
        System.out.println("All values: " + Arrays.toString(array));

        int min = findMinValue(array);
        System.out.println("Min value = " + min);

        int max = findMaxValue(array);
        System.out.println("Max value = " + max);
    }


    private static int findMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int findMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
