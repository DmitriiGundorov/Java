package OOP_HomeWork_2;

public class Chicken extends Bird {

//    Курица

    public Chicken(Double height, Double weight, int eyeColor) {
        super(height, weight, eyeColor, "Кудак", 0.0);
    }

    @Override
    public void printInfo() {
        System.out.println("Класс = Курицы (птицы)\n" +
                "Цвет глаз = " + getEyeColor() + "\n" +
                "Вес = " + getWeight() + "\n" +
                "Высота = " + getHeight());
    }

    @Override
    public void doFlight() {
        System.out.println("Курица не летает");
    }
}
