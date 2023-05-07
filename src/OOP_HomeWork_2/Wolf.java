package OOP_HomeWork_2;

import java.util.Date;

public class Wolf extends WildAnimal {

//    Волки

    public Wolf(Double height, Double weight, int eyeColor, String wlHabitat, Date fDate, boolean isLeader) {
        super(height, weight, eyeColor, "УУУУУУ", wlHabitat, fDate);
        this.isLeader = isLeader;
    }

    @Override
    public void printInfo() {
        System.out.println("Класс = Волки (дикие животные)\n" +
                "Дата нахождения = " + getfDate() + "\n" +
                "Ареал обитания = " + getWlHabitat() + "\n" +
                "Цвет глаз = " + getEyeColor() + "\n" +
                "Вес = " + getWeight() + "\n" +
                "Высота в холке = " + getHeight() + "\n" +
                "Вожак в стае = " + (isLeader ? "да" : "нет"));
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    private boolean isLeader;
}