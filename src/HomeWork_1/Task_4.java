package HomeWork_1;

// Условие задачи. Реализовать простой калькулятор
// Привести строку к double типу: Double.parseDouble(str); либо использовать Scanner.nextInt или nextDouble.

import java.util.Scanner;

public class Task_4 {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double n = scanner.nextDouble();
        System.out.print("Введите первое число: ");
        double m = scanner.nextDouble();
        System.out.print("Введите арифметическое действие: ");
        String arif = scanner.next();
        double result;
        switch (arif) {
            case "+":
                result = n + m;
                break;
            case "-":
                result = n - m;
                break;
            case "*":
                result = n * m;
                break;
            case "/":
                result = n / m;
                break;
            default:
                System.out.println("Некорректный ввод арифметического действия");
                return;
        }
        System.out.println("Результат: " + n + " " + arif + " " + m + " = " + result);
    }
}