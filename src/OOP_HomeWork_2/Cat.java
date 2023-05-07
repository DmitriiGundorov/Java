package OOP_HomeWork_2;

import java.util.Date;

public class Cat extends Pet {

//    Кошки

    public Cat(Double height, Double weight, int eyeColor, String name, String breed, boolean isVaccinations, Date bDate, int coatColor) {
        super(height, weight, eyeColor, "мяу", name, breed, isVaccinations, coatColor, bDate);
    }

    @Override
    public void printInfo() {
        System.out.println("Класс = Кошки (домашние животные)\n" +
                "Имя = " + getName() + "\n" +
                "Порода = " + getBreed() + "\n" +
                "Дата рождения = " + getbDate() + "\n" +
                "Вакцинация = " + (isVaccinations() ? "есть" : "отсутствует") + "\n" +
                "Цвет шерсти = " + getCoatColor() + "\n" +
                "Цвет глаз = " + getEyeColor() + "\n" +
                "Вес = " + getWeight() + "\n" +
                "Высота в холке = " + getHeight());
    }

    @Override
    public void showKindness() {
        System.out.println("Кот(кошка) мурлыкает");
    }
}