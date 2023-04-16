package HomeWork_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*Условие задачи. Реализуйте алгоритм сортировки пузырьком числового массива,
        результат после каждой итерации запишите в лог-файл.
        (через FileWriter).*/
public class Task_1 {
    public static void bubbleSort(int[] arr) {
        try {
            try (FileWriter in = new FileWriter("bubble.txt")) {
                System.out.println("Выполняется запись лог-файла");
                for (int i = 1; i < arr.length; i++) {
                    boolean bubbleSorted = true;
                    for (int j = 0; j < arr.length - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            bubbleSorted = false;
                            int temp = arr[j + 1];
                            arr[j + 1] = arr[j];
                            arr[j] = temp;
                        }
                        in.append(Arrays.toString(arr)).append("\n");
                    }
                    if (bubbleSorted) break;
                }

                System.out.println("Отсортированный массив: " + Arrays.toString(arr));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
