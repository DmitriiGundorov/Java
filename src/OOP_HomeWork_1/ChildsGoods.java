package HomeWork_1;

//Детские товары

public class ChildsGoods extends Goods {
    public ChildsGoods(String name, Double price, Integer quantity, Integer minAge, Boolean isHypoallergenic) {
        super(name, price, quantity, "шт.");
        this.minAge = minAge;
        this.isHypoallergenic = isHypoallergenic;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Boolean getHypoallergenic() {
        return isHypoallergenic;
    }

    public void setHypoallergenic(Boolean hypoallergenic) {
        isHypoallergenic = hypoallergenic;
    }

//    Минимальный возраст

    private Integer minAge;

//    Гипоаллергенность

    private Boolean isHypoallergenic;

    @Override
    public String toString() {
        return "ChidsGoods" +
                super.toString().replace("}", ", Минимальный возраст = " + minAge +
                        ", Гипоаллергенность = " + (isHypoallergenic ? "да" : "нет") + "}");
    }
}
