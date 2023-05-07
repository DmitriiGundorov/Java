package OOP_HomeWork_2;

import java.util.ArrayList;
import java.util.Date;

public class Zoo {
    public Zoo() {
        setTestData();
    }

    ArrayList<Animal> zooDB = new ArrayList<>();

    private void setTestData() {
        zooDB.add(new Cat(18.5, 4.3, 0x1b612f, "Барсик", "Персидский",
                false, new Date(117, 3, 14), 0xdb35d6));
        zooDB.add(new Dog(39.2, 10.3, 0x5c4f1c, "Покоритель", "Сиба-ину",
                true, 0x12e012, new Date(118, 3, 12), false));
        zooDB.add(new Tiger(92.6, 76.8, 0xFF0000, "Сихотэ-Алинский заповедник",
                new Date(115, 3, 12)));
        zooDB.add(new Wolf(34.2, 10.3, 0xFF0000, "Тайга",
                new Date(119, 1, 7), true));
        zooDB.add(new Chicken(25.7, 2.7, 0xFF0000));
        zooDB.add(new Stork(115.8, 4.8, 0xFF0000, 2000.0));
    }

    public void addAnimal(Animal an) {
        zooDB.add(an);
        System.out.println("Прибыл в зоопарк:");
        an.printInfo();
    }

    public void killAnimal(Integer index) {
        System.out.println("Убыл из зоопарка:");
        zooDB.get(index).printInfo();
        zooDB.remove(index);
    }

    public void getInfo(Integer index) {
        zooDB.get(index).printInfo();
    }

    public void kickAnimal(Integer index) {
        zooDB.get(index).makeSound();
    }

    public void printAllAnimals() {
        for (Animal an : zooDB) {
            an.printInfo();
            System.out.println();
        }
    }

    public void kickAllAnimals() {
        for (Animal an : zooDB) {
            an.makeSound();
        }
    }

    public void doFly(Integer index) {
        if (zooDB.get(index) instanceof Bird)
            ((Bird) zooDB.get(index)).doFlight();
        else
            System.out.println("Не птица");
    }

    public void toShowKindness(Integer index) {
        if (zooDB.get(index) instanceof Pet)
            ((Pet) zooDB.get(index)).showKindness();
        else
            System.out.println("Не домашний питомец");
    }

    public void doTrain(Integer index) {
        if (zooDB.get(index) instanceof Dog) {
            System.out.println("До дрессировки собака: " + (((Dog) zooDB.get(index)).isHasTraining() ? "" : "не") + "дрессирована");
            ((Dog) zooDB.get(index)).doTrain();
            System.out.println("После дрессировки собака: " + (((Dog) zooDB.get(index)).isHasTraining() ? "" : "не") + "дрессирована");
        } else
            System.out.println("Это не собака");
    }
}