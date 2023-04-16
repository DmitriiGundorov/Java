package seminar_3;
//Условие задачи. Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task_1 {
    public static void sortList(String[] args) {

        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(1, 11));
        }
        System.out.println("Исходный массив: " + list);
        Collections.sort(list);
        System.out.println("Отсортированный массив: " + list);
    }
}
