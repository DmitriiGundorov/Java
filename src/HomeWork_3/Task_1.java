package HomeWork_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.sort;

//Условие задачи. Реализовать алгоритм сортировки слиянием
public class Task_1 {
    public static int[] mergeSort(int[] array) {

        if (array == null) return null; // Проверка на нулевое значение массива
        if (array.length < 2) return array; // Проверка количества элементов в массиве, если 1 эл-т массив отсортирован
        int[] arrayLeft = new int[array.length / 2]; // Копирование левой части массива (до середины)
        System.arraycopy(array, 0, arrayLeft, 0, array.length / 2);
        int[] arrayRight = new int[array.length - array.length / 2]; // Копирование правой части массива (от середины)
        System.arraycopy(array, array.length / 2, arrayRight, 0,
                array.length - array.length / 2);
        sort(arrayLeft);
        sort(arrayRight);
        return mergeArray(arrayLeft, arrayRight);
    }

    public static int[] mergeArray(int[] firstArray, int[] secondArray) {
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < thirdArray.length; i++) {
            if (positionA == firstArray.length) {
                thirdArray[i] = secondArray[positionB];
                positionB++;
            } else if (positionB == secondArray.length) {
                thirdArray[i] = firstArray[positionA];
                positionA++;
            } else if (firstArray[positionA] < secondArray[positionB]) {
                thirdArray[i] = firstArray[positionA];
                positionA++;
            } else {
                thirdArray[i] = secondArray[positionB];
                positionB++;
            }
        }
        return thirdArray;
    }
}
