package arrays;

import java.util.Arrays;
import java.util.Random;

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
