package OOP_HomeWork_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "\n1. Добавить животное\n" + "2. Удалить животное\n" + "3. Получить информацию по животному\n" +
                        "4. Получить информацию по всем животным\n" + "5. Заставить животное издавать звук\n" +
                        "6. Заставить всех животных издавать звук\n" + "7. Определить какое животное летает\n" +
                        "8. Определить животное, проявляющее ласку\n" + "9. Дрессировка животного");
        System.out.print("Выберите раздел: ");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:
                myZoo.addAnimal(new Chicken(25.7, 2.7, 0xFF0000)); // На примере курицы
                break;
            case 2:
                System.out.print("Выберите животное, которого удалить: ");
                ex = scan.nextInt();
                myZoo.killAnimal(ex);
                break;
            case 3:
                System.out.print("Выберите интересующее животное: ");
                ex = scan.nextInt();
                myZoo.getInfo(ex);
                break;
            case 4:
                myZoo.printAllAnimals();
                break;
            case 5:
                System.out.print("Выберите животное: ");
                ex = scan.nextInt();
                myZoo.kickAnimal(ex);
                break;
            case 6:
                myZoo.kickAllAnimals();
                break;
            case 7:
                System.out.print("Выберите животное: ");
                ex = scan.nextInt();
                myZoo.doFly(ex);
                break;
            case 8:
                System.out.print("Выберите животное для ласки: ");
                ex = scan.nextInt();
                myZoo.toShowKindness(ex);
                break;
            case 9:
                System.out.print("Выберите животное для дрессировки: ");
                ex = scan.nextInt();
                myZoo.doTrain(ex);
                break;
        }
    }
}
