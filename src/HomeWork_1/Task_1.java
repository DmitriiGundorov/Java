package HomeWork_1;

import java.util.Scanner;

//Условие задачи. Вычислить n-ое треугольного число (сумма чисел от 1 до n)
public class Task_1 {
    public static void triangularNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение n треугольного числа:");
        int n = scanner.nextInt();
        int t = (n * (n + 1)) / 2;
        System.out.println("Результат треугольного числа " + n + " -> " + t);

    }

}
