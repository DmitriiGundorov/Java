package HomeWork_5;

import java.util.*;

//Условие задачи. Реализуйте структуру телефонной книги с помощью HashMap,
//        учитывая, что 1 человек может иметь несколько телефонов.
//
public class Task_1 {
    public static HashMap<String, List<String>> addContacts() {
        HashMap<String, List<String>> contact;
        contact = new LinkedHashMap<>();
        contact.put("Иванов Иван", Arrays.asList("+7(123)7654321", "+7(321)2222222"));
        contact.put("Светлана Петрова", Arrays.asList("+7(495)7777777", "+7(920)3333333"));
        contact.put("Кристина Белова", Arrays.asList("+7(987)5555555"));
        return contact;
    }

    public static void printContacts(HashMap<String, List<String>> contacts) {
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            System.out.printf("""
                    Контакт: %s
                    Телефон(ы): %s\s \n
                    """, entry.getKey(), entry.getValue());
        }
    }
}