package HomeWork_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

//Условие задачи. Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class Task_2 {
    public static void listEnqueue() {

        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(1, 5));
        }
        System.out.println("Enqueue. Исходный список: " + list);
        System.out.print("Введите число для записи в конец списка: ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        list.addLast(temp);
        System.out.println("Новый список: " + list + "\n");
    }

    public static void getListDequeue() {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(1, 5));
        }
        System.out.println("Dequeue. Исходный список: " + list);
            list.removeFirst();
            System.out.println("Список с удаленным первым числом: " + list + "\n");
        }


    public static void getFirst() {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(1, 5));
        }
        System.out.println("First. Исходный список: " + list);
        System.out.println("Первый элемент списка: " + list.getFirst());
    }
}
