package HomeWork_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "     Задача № 1" + "\n");
        long startTime1 = System.currentTimeMillis();
        int[] array = new int[]{1, 5, 3, 8, 6, 4, 9, 7};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Отсортированный массив: " + Arrays.toString(Task_1.mergeSort(array)));
        System.out.println("Время выполнения задачи, мс: " + (System.currentTimeMillis() - startTime1));

        System.out.println("\n" + "     Задача № 2" + "\n");
        long startTime2 = System.currentTimeMillis();
        Task_2.listNumber();
        System.out.println("Время выполнения задачи, мс: " + (System.currentTimeMillis() - startTime2));

        System.out.println("\n" + "     Задача № 3" + "\n");
        long startTime3 = System.currentTimeMillis();
        Task_3.minMaxAverage();
        System.out.println("Время выполнения задачи, мс: " + (System.currentTimeMillis() - startTime3));
    }
}
