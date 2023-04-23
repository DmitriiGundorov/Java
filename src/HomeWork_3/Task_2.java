package HomeWork_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Условие задачи. Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task_2 {

    public static void listNumber() {

        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(1, 10));
        }
        System.out.println("Исходный массив: " + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 1) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Преобразованный массив: " + list);
    }
}
