package HomeWork_1;

import java.util.Scanner;

//Условие задачи. Вычислить факториал n! (произведение чисел от 1 до n).
public class Task_2 {
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение факториала n (не более 12):");
        int n = scanner.nextInt();
        int temp = 1;
        int count = 1;
        while (count <= n) {
            temp = temp * count;
            count++;
        }
        System.out.println("Значение факториала " + n + " -> " + temp);
    }
}
