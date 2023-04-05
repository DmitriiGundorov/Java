package lesson1.tasks;

import java.time.LocalDateTime;

// Задача №1.
// - Настроить проект, вывести в консоль “Hello world!”.
// - Вывести в консоль системные дату и время.

public class Task1 {
    public static void hello() {
        System.out.println("Hello, world!");
        System.out.println(LocalDateTime.now());
    }
}
