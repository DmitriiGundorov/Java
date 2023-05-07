package OOP_HomeWork_2;

import java.util.Date;

public abstract class Pet extends Animal {

//    Домашнее животное

    public Pet(Double height, Double weight, int eyeColor, String sound, String name, String breed, boolean isVaccinations, int coatColor, Date bDate) {
        super(height, weight, eyeColor, sound);
        this.name = name;
        this.breed = breed;
        this.isVaccinations = isVaccinations;
        this.coatColor = coatColor;
        this.bDate = bDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isVaccinations() {
        return isVaccinations;
    }

    public void setVaccinations(boolean vaccinations) {
        isVaccinations = vaccinations;
    }

    public int getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(int coatColor) {
        this.coatColor = coatColor;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    private String name;
    private String breed;
    private boolean isVaccinations;
    private int coatColor;
    private Date bDate;

    public abstract void showKindness();
}