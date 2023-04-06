package HomeWork_1;

//  Условие задачи. Вывести все простые числа от 1 до 1000.
//        Простое число - то число которое делится без остатка
//        только на 1 и на само себя (1 - это не простое число).
public class Task_3 {
    public static void primeNumber() {
        int n = 1000;
        boolean b = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.print(i + " ");
            else b = true;
        }
    }
}
