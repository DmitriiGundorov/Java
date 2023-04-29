package HomeWork_5;

import java.util.*;

//Условие задачи. Дан список сотрудников, написать программу, которая найдёт и выведет
//        повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class Task_2 {
    private static String[] names = new String[]{
            "Иван Иванов", "Светлана Петрова", "Кристина Белова",
            "Анна Мусина", "Анна Крутова", "Иван Юрин",
            "Петр Лыков", "Павел Чернов", "Иван Иванов",
            "Петр Чернышов", "Мария Федорова", "Марина Светлова",
            "Мария Савина", "Иван Иванов", "Мария Рыкова",
            "Анна Крутова", "Марина Лугова", "Анна Владимирова",
            "Петр Лыков", "Иван Мечников", "Петр Петин",
            "Петр Лыков", "Иван Ежов"
    };

    public static void search() {
        Map<String, Integer> nameTop = new HashMap<>();
        for (String nameFull : names) {
            String lastName = nameFull.split(" ")[0].toUpperCase();
            nameTop.put(lastName, nameTop.get(lastName) == null ? 1 : nameTop.get(lastName) + 1);
        }
        List<Integer> ratingOfNames = new ArrayList<>(nameTop.values());
        ratingOfNames.removeIf(x -> x <= 1);
        Collections.sort(ratingOfNames, Collections.reverseOrder());
        System.out.println("Количество имен в справочнике:");
        for (int rating : ratingOfNames) {
            for (var name : nameTop.entrySet()) {
                if (name.getValue() == rating)
                    System.out.println(name.getKey() + " встречается, раз: " + name.getValue());
            }
        }
    }
}

