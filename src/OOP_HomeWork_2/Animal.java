package OOP_HomeWork_2;

public abstract class Animal {
    public Animal(Double height, Double weight, int eyeColor, String sound) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.sound = sound;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(int eyeColor) {
        this.eyeColor = eyeColor;
    }

    private Double height;
    private Double weight;
    private int eyeColor;

    public void makeSound() {
        System.out.println(this.getClass().getSimpleName() + " Издает звук: \"" + sound + "\"");
    }

    private String sound;

    public abstract void printInfo();
}
