package OOP_HomeWork_4;

import java.util.Random;

public class DynamicArr {
    public DynamicArr() {
        Random random = new Random();

        Integer[] intArray = new Integer[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(1, 50);
        }
        intArr = new WorkArray<>(intArray);

        doubleArr = new WorkArray<>();
        for (int i = 0; i < 5; i++) {
            doubleArr.add(random.nextDouble(1.0, 10.0));
        }

        strArr = new WorkArray<>();
        for (int i = 0; i < 10; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 1; j < random.nextInt(3, 8); j++) {
                str.append((char) random.nextInt(65, 90));
            }
            strArr.add(str.toString());
        }
    }
    public WorkArray<Integer> intArr;
    public WorkArray<Double> doubleArr;
    public WorkArray<String> strArr;
}
