package HomeWork_1;

import java.util.Date;

//    Яйца

public class Eggs extends Food{
    public Eggs(String name, Double price, Integer quantity, Date exDate, Integer quantityPerPackage) {
        super(name, price, quantity, "уп.", exDate);
        this.quantityPerPackage = quantityPerPackage;
    }

    public Integer getQuantityPerPackage() {
        return quantityPerPackage;
    }

    public void setQuantityPerPackage(Integer quantityPerPackage) {
        this.quantityPerPackage = quantityPerPackage;
    }

    /**
     * Количество штук в упаковке
     */
    private Integer quantityPerPackage;

    @Override
    public String toString() {
        return "Eggs - " +
                super.toString().replace("}", ", Количество штук в упаковке = " + quantityPerPackage + " шт.}");
    }
}