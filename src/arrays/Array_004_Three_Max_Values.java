package arrays;

import java.util.Arrays;
import java.util.Random;

public class Array_004_Three_Max_Values {
    public static void main(String[] args) {
        int[] array = new int[10];
        fullArrayOfValues(array);

        int[] ThreeMaxValueWithFor = find3MaxValueWithFor(array);
        System.out.println("ThreeMaxValueWithFor: " + Arrays.toString(ThreeMaxValueWithFor));

        int[] ThreeMaxValueWithForEach = find3MaxValueWithForEach(array);
        System.out.println("ThreeMaxValueWithForEach: " + Arrays.toString(ThreeMaxValueWithForEach));
    }

    private static int[] find3MaxValueWithForEach(int[] array) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int value : array) {
            if (firstMax > value) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = value;
            } else if (secondMax > value) {
                thirdMax = secondMax;
                secondMax = value;
            } else if (thirdMax > value) {
                thirdMax = value;
            }
        }
        return Arrays.copyOf(array, 3);
    }

    private static int[] find3MaxValueWithFor(int[] array) {
        if (array.length < 3) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int value = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = value;
                }
            }
        }
        return Arrays.copyOf(array, 3);
    }

    private static void fullArrayOfValues(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Random Array: " + Arrays.toString(array));
    }
}
