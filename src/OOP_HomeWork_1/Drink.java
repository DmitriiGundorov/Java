package OOP_HomeWork_1;

import java.util.Date;

//    Напитки

public class Drink extends Food {
    public Drink(String name, Double price, Integer quantity, Date exDate, Double volume) {
        super(name, price, quantity, "шт.", exDate);
        this.volume = volume;
    }
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

//    Объём

    private Double volume;

    @Override
    public String toString() {
        return "Drink - " +
                super.toString().replace("}", ", Объём = " + volume + " мл}");
    }
}