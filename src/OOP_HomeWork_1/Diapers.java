package OOP_HomeWork_1;

//    Подгузники


public class Diapers extends ChildsGoods {
    public Diapers(String name, Double price, Integer quantity, Integer minAge, Boolean isHypoallergenic, String size, Integer minWeight, Integer maxWeight, String type) {
        super(name, price, quantity, minAge, isHypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Integer minWeight) {
        this.minWeight = minWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    Размер

    private String size; // S, M, L, XL, XXL

//    Минимальный вес

    private Integer minWeight;

//    Максимальный вес

    private Integer maxWeight;

//    Тип

    private String type;

    @Override
    public String toString() {
        return "Diapers - " +
                super.toString().replace("}", ", Размер = " + size +
                        ", Минимальный вес = " + minWeight +
                        " кг, Максимальный вес = " + maxWeight +
                        " кг, Тип = " + type + "}");
    }
}
