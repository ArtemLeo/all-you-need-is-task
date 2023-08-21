package arrays;

import java.util.Arrays;

public class Array_002_Merge {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10};
        System.out.println("Originals arrays = " + Arrays.toString(firstArray) + " and " + Arrays.toString(secondArray));

        int[] mergeArrayWithFor = mergeWithFor(firstArray, secondArray);
        System.out.println("MergeArrayWithFor = " + Arrays.toString(mergeArrayWithFor));

        int[] mergeArrayWithArrayCopy = mergeArrayWithArrayCopy(firstArray, secondArray);
        System.out.println("MergeArrayWithArrayCopy = " + Arrays.toString(mergeArrayWithArrayCopy));

        int[] mergeArrayWithCopyOfAndArrayCopy = mergeArrayWithCopyOfAndArrayCopy(firstArray, secondArray);
        System.out.println("MergeArrayWithCopyOfAndArrayCopy = " + Arrays.toString(mergeArrayWithCopyOfAndArrayCopy));
    }


    private static int[] mergeWithFor(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            newArray[firstArray.length + i] = secondArray[i];
        }
        return newArray;
    }

    private static int[] mergeArrayWithArrayCopy(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);
        return newArray;
    }

    private static int[] mergeArrayWithCopyOfAndArrayCopy(int[] firstArray, int[] secondArray) {
        int[] newArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);
        return newArray;
    }
}

/*
   Arrays.copyOf(arr1, arr1.length + arr2.length);
   Создает новый массив, копируя все элементы из массива arr1 и задавая новую длину, равную сумме длин обоих исходных массивов.
   Это дает нам начальную часть нового массива, которая содержит все элементы из arr1.

   System.arraycopy -> (исходный массив, начальный индекс исходного массива, целевой массив, начальный индекс целевого массива, количество элементов);
   System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
   Используется для копирования элементов из массива arr2 в массив merged, начиная с индекса arr1.length.
   Это означает, что мы начнем копирование элементов из arr2 в конец массива merged, который уже содержит элементы из arr1.
 */
