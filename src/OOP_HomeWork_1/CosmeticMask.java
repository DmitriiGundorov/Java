package OOP_HomeWork_1;

//Маски

public class CosmeticMask extends Hygiene {
    public CosmeticMask(String name, Double price, Integer quantity, Integer quantityPerPackage) {
        super(name, price, quantity, quantityPerPackage);
    }

    @Override
    public String toString() {
        return "CosmeticMask - " + super.toString();
    }
}