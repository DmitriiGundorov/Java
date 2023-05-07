package OOP_HomeWork_2;

import java.util.Date;

public class Dog extends Pet {

//    Собака

    public Dog(Double height, Double weight, int eyeColor, String name, String breed, boolean isVaccinations,
               int coatColor, Date bDate, boolean hasTraining) {
        super(height, weight, eyeColor, "Гав", name, breed, isVaccinations, coatColor, bDate);
        this.hasTraining = hasTraining;
    }

    public boolean isHasTraining() {
        return hasTraining;
    }

    private boolean hasTraining;

    public void doTrain() {
        if (!hasTraining)
            hasTraining = Math.random() > 0.1;
    }

    @Override
    public void printInfo() {
        System.out.println("Класс = Собаки (домашние животные)\n" +
                "Имя = " + getName() + "\n" +
                "Порода = " + getBreed() + "\n" +
                "Дата рождения = " + getbDate() + "\n" +
                "Вакцинация = " + (isVaccinations() ? "есть" : "отсутствует") + "\n" +
                "Цвет шерсти = " + getCoatColor() + "\n" +
                "Цвет глаз = " + getEyeColor() + "\n" +
                "Вес = " + getWeight() + "\n" +
                "Высота в холке = " + getHeight() + "\n" +
                "Дрессировка = " + (hasTraining ? "есть" : "отсутствует"));
    }

    @Override
    public void showKindness() {
        System.out.println("Собака релаксирует");
    }
}
