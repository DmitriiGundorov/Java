package OOP_HomeWork_1;

import java.util.Date;

//    Молоко

public class Milk extends Drink {
    public Milk(String name, Double price, Integer quantity, Date exDate, Double volume, Double fatPercent) {
        super(name, price, quantity, exDate, volume);
        this.fatPercent = fatPercent;
    }

    public Double getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(Double fatPercent) {
        this.fatPercent = fatPercent;
    }

//    Процент жирности молока

    private Double fatPercent;

    @Override
    public String toString() {
        return "Milk - " +
                super.toString().replace("}", ", Жирность = " + fatPercent + " %}");
    }
}