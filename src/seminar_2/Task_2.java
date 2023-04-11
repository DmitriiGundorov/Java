package seminar_2;
//Условие задачи. Напишите метод, который сжимает строку.
//        Пример: aaaabbbcdd → a4b3cd2

public class Task_2 {
/*    public static String stringCompression(String argument) {
        int count = 1;
        StringBuilder result = new StringBuilder();
        String[] arr = argument.split("");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result.append(arr[i]);
                continue;
            }
            if (arr[i].equals(arr[i - 1])) count++;
            else if (count != 1) {
                result.append(count);
                count = 1;
                result.append(arr[i]);
            } else {
                count = 1;
                result.append(arr[i]);
            }
        }
        if (count != 1) result.append(count);
        return result.toString();
    }
}*/

//Решение Илмира

    public static String stringCompression(String argument) {
        int count = 1;
        String[] arr = argument.split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result.append(arr[i]);
                continue;
            }
            if (arr[i].equals(arr[i - 1])) {
                count++;
            } else if (count != 1) {
                result.append(count);
                count = 1;
                result.append(arr[i]);
            } else {
                result.append(arr[i]);
            }
        }
        if (count != 1) result.append(count);


        return result.toString();
    }
}