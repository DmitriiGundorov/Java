package seminar_2;
// Условие задачи. Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

public class Task_1 {
    public static String getRepeatString(int numN) {
        StringBuilder sb = new StringBuilder();
//        sb.append("c1");
        for (int i = 0; i < numN/2; i++) {
            if (i % 2 == 0) sb.append("c1");
            else sb.append("c2");
        }
        System.out.println(sb.toString().length());
        return sb.toString();
    }

}
