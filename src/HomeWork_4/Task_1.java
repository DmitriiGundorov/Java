package HomeWork_4;

import java.util.*;

//Условие задачи. Пусть дан LinkedList с несколькими элементами.
//        Реализуйте метод, который вернет “перевернутый” список.
public class Task_1 {
    public static void reverseList() {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(1, 5));
        }
        System.out.println("Заданный список: " + list);
        System.out.print("Перевернутый список: ");
        while (!list.isEmpty()) {
            System.out.print(list.removeLast() + " ");
        }
        System.out.println();
    }
}
