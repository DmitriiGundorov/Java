package HomeWork_1;

//    Предметы гигиены

public class Hygiene extends Goods {
    public Hygiene(String name, Double price, Integer quantity, Integer quantityPerPackage) {
        super(name, price, quantity, "уп.");
        this.quantityPerPackage = quantityPerPackage;
    }

    public Integer getQuantityPerPackage() {
        return quantityPerPackage;
    }

    public void setQuantityPerPackage(Integer quantityPerPackage) {
        this.quantityPerPackage = quantityPerPackage;
    }

//    Количество штук в упаковке

    private Integer quantityPerPackage;

    @Override
    public String toString() {
        return "Hygiene" +
                super.toString().replace("}", ", Количество в упаковке = " + quantityPerPackage + " шт.}");
    }
}