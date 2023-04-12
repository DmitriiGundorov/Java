package HomeWork_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 0, 1};
        System.out.println("\n" + "     Задача № 1" + "\n");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Task_1.bubbleSort(arr);
        System.out.println("\n" + "     Задача № 2" + "\n");
        Task_2.parse();
    }
}
