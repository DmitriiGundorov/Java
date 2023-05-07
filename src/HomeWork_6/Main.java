package HomeWork_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_1 testData = new Task_1();
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "\nРазделы поиска:\n" +
                        "1 - Разрешение дисплея\n" +
                        "2 - Модель ЦПУ\n" +
                        "3 - Тип операционной системы\n" +
                        "4 - Цена\n" +
                        "5 - Объем ОЗУ\n" +
                        "Введите раздел поиска: ");

        int input = scan.nextInt();
        switch (input) {
            case 1:
                System.out.print("Введите разрешение экрана (\"1366x768\", \"1920x1080\", \"2160x1440\", \"3456x2234\"): ");
                scan = new Scanner(System.in);
                var resolution = scan.nextLine();
                testData.searchByResolution(resolution);
                break;
            case 2:
                System.out.print("Введите модель ЦПУ (\"AMD\", \"INTEL\", \"APPLE\"): ");
                scan = new Scanner(System.in);
                var cpu = scan.nextLine();
                testData.searchByCPU(cpu);
                break;
            case 3:
                System.out.print("Введите операционную систему (\"Windows 10\", \"Windows 11\", \"macOS\",\"Linux\", \"Без ОС\"): ");
                scan = new Scanner(System.in);
                var os = scan.nextLine();
                testData.searchByOS(os);
                break;
            case 4:
                System.out.print("Введите минимальную цену: ");
                scan = new Scanner(System.in);
                Double minPrice = scan.nextDouble();
                Double maxPrice;
                do {
                    System.out.print("Введите максимальную цену: ");
                    maxPrice = scan.nextDouble();
                } while (maxPrice <= minPrice);
                testData.searchByPrice(minPrice, maxPrice);
                break;
            case 5:
                System.out.print("Введите наименьший объем ОЗУ: ");
                scan = new Scanner(System.in);
                Integer minRAM = scan.nextInt();
                Integer maxRAM;
                do {
                    System.out.print("Введите наибольший объем ОЗУ: ");
                    maxRAM = scan.nextInt();
                } while (maxRAM <= minRAM);
                testData.searchByRAM(minRAM, maxRAM);
                break;
        }
    }
}