package HomeWork_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Условие задачи. Задан целочисленный список ArrayList.
//        Найти минимальное, максимальное и среднее из этого списка.
public class Task_3 {
    public static void minMaxAverage() {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(1, 10));
        }
        System.out.println("Заданный массив: " + list);
        int min = list.get(0);
        int max = 0;
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
            if (list.get(i) >= max) max = list.get(i);
            average += list.get(i);
        }
        average /= list.size();
        System.out.println("Минимальное значение списка -> " + min);
        System.out.println("Максимальное значение списка -> " + max);
        System.out.println("Среднее значение списка -> " + average);
    }
}
