package OOP_HomeWork_2;

public class Stork extends Bird {

//    Аист

    public Stork(Double height, Double weight, int eyeColor, Double flightAlt) {
        super(height, weight, eyeColor, "Звук строкочащий", flightAlt);
    }

    @Override
    public void printInfo() {
        System.out.println("Класс = Аист (птицы)\n" +
                "Цвет глаз = " + getEyeColor() + "\n" +
                "Вес = " + getWeight() + "\n" +
                "Высота = " + getHeight() + "\n" +
                "Высота полёта = " + getFlightAlt());
    }
}