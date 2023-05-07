package OOP_HomeWork_1;

import java.util.Date;

//    Лимонад

public class Lemonade extends Drink{
    public Lemonade(String name, Double price, Integer quantity, Date exDate, Double volume) {
        super(name, price, quantity, exDate, volume);
    }

    @Override
    public String toString() {
        return "Lemonade - " + super.toString();
    }
}