package OOP_HomeWork_4;

import java.util.Scanner;

public class ConsoleMenu {
    public ConsoleMenu() {
        dA = new DynamicArr();
    }

    private DynamicArr dA;

    public void mainMenu() throws Exception {
        Scanner scan = new Scanner(System.in);
        int cmd = 0;
        do {
            System.out.print("Перечень команд:\n0. Выход\n1. Массив целых чисел\n" +
                    "2. Массив вещественных чисел\n3. Массив строк\nВведите команду: ");
            cmd = scan.nextInt();
            switch (cmd) {
                case 1:
                    this.intArr();
                    break;
                case 2:
                    this.doublelArr();
                    break;
                case 3:
                    this.strArr();
                    break;
            }
        } while (cmd != 0);
    }

    private void intArr() throws Exception {
        System.out.println("Пример использования массива с типом данных Integer:\t" + dA.intArr);
        dA.intArr.add(35);
        System.out.println("Добавление в конец массива элемента со значением 35:\t" + dA.intArr);
        dA.intArr.add(12, 5);
        System.out.println("Добавление элемента 12 в индекс 5:\t" + dA.intArr);
        dA.intArr.remove(10);
        System.out.println("Удаление элемента с индексом 10:\t" + dA.intArr);
        dA.intArr.remove((Integer) 35);
        System.out.println("Удаление элементов со значением 35:\t" + dA.intArr);
        System.out.println("Минимальное значение массива:\t" + dA.intArr.min(Integer::compare));
        System.out.println("Максимальное значение массива:\t" + dA.intArr.max(Integer::compare));
        dA.intArr.replace(15, 4);
        System.out.println("Замена элемента с индексом 4 на число 15:\t" + dA.intArr);
        System.out.println("Длина массива:\t" + dA.intArr.size());
        System.out.println("Сумма элементов массива:\t" + dA.intArr.sum());
        System.out.println("Произведение элементов массива:\t" + dA.intArr.multiplication());
        dA.intArr.bubbleSort(Integer::compare);
        System.out.println("Сортировка пузырьком:\t" + dA.intArr);
        dA.intArr.insertionSort(Integer::compare);
        System.out.println("Сортировка простыми вставками:\t" + dA.intArr);
        dA.intArr.selectionSort(Integer::compare);
        System.out.println("Сортировка простым выбором:\t" + dA.intArr);
        System.out.println("--------------------");
    }

    private void doublelArr() throws Exception {
        System.out.println("Пример использования массива с типом данных Double:\t" + dA.doubleArr);
        dA.doubleArr.add(35.23);
        System.out.println("Добавление в конец массива элемента со значением 35.23:\t" + dA.doubleArr);
        dA.doubleArr.add(8.55, 5);
        System.out.println("Добавление элемента 8.55 в индекс 5:\t" + dA.doubleArr);
        dA.doubleArr.remove(3);
        System.out.println("Удаление элемента с индексом 3:\t" + dA.doubleArr);
        dA.doubleArr.remove((Double) 35.23);
        System.out.println("Удаление элементов со значением 35.23:\t" + dA.doubleArr);
        System.out.println("Минимальное значение массива:\t" + dA.doubleArr.min(Double::compare));
        System.out.println("Максимальное значение массива:\t" + dA.doubleArr.max(Double::compare));
        dA.doubleArr.replace(15.68, 4);
        System.out.println("Замена элемента с индексом 4 на число 15.68:\t" + dA.doubleArr);
        System.out.println("Длина массива:\t" + dA.doubleArr.size());
        System.out.println("Сумма элементов массива:\t" + dA.doubleArr.sum());
        System.out.println("Произведение элементов массива:\t" + dA.doubleArr.multiplication());
        dA.doubleArr.bubbleSort(Double::compare);
        System.out.println("Сортировка пузырьком:\t" + dA.doubleArr);
        dA.doubleArr.insertionSort(Double::compare);
        System.out.println("Сортировка простыми вставками:\t" + dA.doubleArr);
        dA.doubleArr.selectionSort(Double::compare);
        System.out.println("Сортировка простым выбором:\t" + dA.doubleArr);
        System.out.println("--------------------");
    }

    private void strArr() throws Exception {
        System.out.println("Пример использования массива с типом данных String:\t" + dA.strArr);
        dA.strArr.add("DMITRII");
        System.out.println("Добавление в конец массива строку DMITRII:\t" + dA.strArr);
        dA.strArr.add("VASILII", 3);
        System.out.println("Добавление строки VASILII в индекс 3:\t" + dA.strArr);
        dA.intArr.remove(7);
        System.out.println("Удаление элемента с индексом 7:\t" + dA.strArr);
        dA.strArr.remove("DMITRII");
        System.out.println("Удаление строки DMITRII:\t" + dA.strArr);
        System.out.println("Строка с минимальной длиной:\t" + dA.strArr.min((s0, s1) -> s0.length() - s1.length()));
        System.out.println("Строка с максимальной длиной:\t" + dA.strArr.max((s0, s1) -> s0.length() - s1.length()));
        dA.strArr.replace("ANASTASIYA", 6);
        System.out.println("Замена строки с индексом 6 на строку ANASTASIYA:\t" + dA.strArr);
        System.out.println("Длина массива:\t" + dA.strArr.size());
        dA.strArr.bubbleSort((s0, s1) -> s0.length() - s1.length());
        System.out.println("Сортировка пузырьком:\t" + dA.strArr);
        dA.strArr.insertionSort((s0, s1) -> s0.length() - s1.length());
        System.out.println("Сортировка простыми вставками");
        dA.strArr.selectionSort((s0, s1) -> s0.length() - s1.length());
        System.out.println("Сортировка простым выбором:\t" + dA.strArr);
        System.out.println("--------------------");
    }
}
