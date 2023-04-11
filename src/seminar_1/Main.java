package seminar_1;

import seminar_1.tasks.Task3;

public class Main {
    public static void main(String[] args) {
        //    Task1 task1=new Task1();
        //    Task1.hello();
        //    task.hello(); //В случае исключения static в методе hello
        //    Task2.name();
        int[] array = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println(Task3.getMaxOneCount(array));

    }
}
