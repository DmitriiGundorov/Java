package OOP_HomeWork_3;

import OOP_HomeWork_3.figure.*;
import OOP_HomeWork_3.figure.base.Figure;
import OOP_HomeWork_3.figure.base.Polygon;

import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleMenu {
    /**
     * Интерфейс взаимодействия с пользователем
     *
     * @throws Exception
     */

    private Collection mainDB = new Collection();
    private PrintWriter pw = new PrintWriter(System.out, true);
    private Scanner scan = new Scanner(System.in);

    /**
     * Главное меню
     *
     * @throws Exception
     */
    public void getMainMenu() throws Exception {
        int cmd = 0;
        do {
            pw.print("1. Вывод общей информации о фигурах\n" +
                    "2. Добавить фигуру\n" +
                    "3. Удалить фигуру\n" +
                    "4. Изменить фигуру\n");

            cmd = getIntValue("команду");
            switch (cmd) {
                case 1:
                    this.calculateAllData();
                    break;
                case 2:
                    this.getMenuAddNewFig();
                    break;
                case 3:
                    this.removeFigure();
                    break;
                case 4:
                    this.editFig();
                    break;
            }
        } while (cmd != 0);
    }

    /**
     * Меню №1. Вывод всех площадей и периметров фигур
     */
    private void calculateAllData() {
        int currIndex = 0;
        mainDB.sort();
        for (Figure fig : mainDB) {
            pw.println("Фигура " + fig.getClass().getSimpleName() + " с индексом " + currIndex++);
            pw.printf("Площадь = " + "%.3f", fig.getArea());
            System.out.println();
            if (fig instanceof Polygon)
                pw.printf("Периметр = " + "%.3f", ((Polygon) fig).getPeremetr());
            if (fig instanceof Circle)
                pw.printf("Длина окружности = " + "%.3f", ((Circle) fig).getLen());
            pw.println("\n-----------------");
        }
    }

    /**
     * Меню №2 Добавление новой фигуры
     *
     * @throws Exception
     */
    private void getMenuAddNewFig() throws Exception {
        int res = 0;
        pw.println("1. Треугольник\n" +
                "2. Квадрат\n" +
                "3. Прямоугольник\n" +
                "4. Круг");
        switch (getIntValue("команду")) {
            case 1:
                res = mainDB.addFigure(new Triangle(getDblValue("сторону A"),
                        getDblValue("сторону B"),
                        getDblValue("сторону C")));
                break;
            case 2:
                res = mainDB.addFigure(new Square(getDblValue("длину стороны")));
                break;
            case 3:
                res = mainDB.addFigure(new Rectangle(getDblValue("длину"), getDblValue("высоту")));
                break;
            case 4:
                res = mainDB.addFigure(new Circle(getDblValue("радиус")));
                break;

        }
        if (res == 0)
            pw.println("Фигура добавлена\n");
        else
            pw.println("Фигура не добавлена, не корректный ввод\n");
    }

    /**
     * Меню №3 Удаление фигуры
     */
    private void removeFigure() {
        int res = mainDB.removeFigure(getIntValue("индекс удаляемой фигуры"));
        if (res == 0)
            pw.println("Фигура удалена\n");
        else
            pw.println("Фигура не удалена, некорректный ввод\n");
    }

    /**
     * Меню №4 Редактирование фигуры
     *
     * @throws Exception
     */
    private void editFig() throws Exception {
        int index = getIntValue("индекс фигуры");
        int res = 0;
        String className = mainDB.getFigure(index).getClass().getSimpleName();
        pw.println(mainDB.getFigure(index));
        switch (className) {
            case "Circle":
                res = mainDB.editFigure(new Circle(getDblValue("радиус")), index);
                break;
            case "Rectangle":
                res = mainDB.editFigure(new Rectangle(getDblValue("длину"), getDblValue("высоту")), index);
                break;
            case "Square":
                res = mainDB.editFigure(new Square(getDblValue("длину стороны")), index);
                break;
            case "Triangle":
                res = mainDB.editFigure(new Triangle(getDblValue("сторону A"),
                        getDblValue("сторону B"),
                        getDblValue("сторону C")), index);
                break;
            default:
                res = -1;
        }
        switch (res) {
            case -1:
                pw.println("Некорректный ввод");
                break;
            case 0:
                pw.println("Изменения выполнены");
                break;
            case 1:
                pw.println("Изменения не выполнены");
                break;
        }
    }

    /**
     * Получение целочисленного значения от пользователя
     *
     * @param msg Текст в диалоге
     * @return
     */
    private int getIntValue(String msg) {
        pw.println("Введите " + msg);
        return scan.nextInt();
    }

    /**
     * Получение числа с плавающей точкой от пользователя
     *
     * @param msg Текст в диалоге
     * @return
     */
    private Double getDblValue(String msg) {
        pw.println("Введите " + msg);
        return scan.nextDouble();
    }

    /**
     * Получение строкового значения от пользователя
     *
     * @param msg Текст в диалоге
     * @return
     */
    private String getStrValue(String msg) {
        pw.println("Введите " + msg);
        return scan.nextLine();
    }

}
