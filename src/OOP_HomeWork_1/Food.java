package HomeWork_1;

import java.util.Date;
import java.text.SimpleDateFormat;


//Продукты питания

public class Food extends Goods {
    public Food(String name, Double price, Object quantity, String unit, Date exDate) {
        super(name, price, quantity, unit);
        this.exDate = exDate;
    }

    public Date getExDate() {
        return exDate;
    }

    public void setExDate(Date exDate) {
        this.exDate = exDate;
    }


//Срок годности

    private Date exDate;

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return "Food" +
                super.toString().replace("}", ", Срок годности = " + formatter.format(exDate) + "}");
    }
}

