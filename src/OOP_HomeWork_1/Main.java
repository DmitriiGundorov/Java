package OOP_HomeWork_1;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Goods> goodsDB = new ArrayList<>();
        System.out.println();
        goodsDB.add(new Bread("Хлеб 'Крестьянский'", 400.00, 10, new Date(123, 4, 10), "Пшеничный"));
        goodsDB.add(new Food("Пельмени Мираторг из мраморной говядины", 599.99, 1, "уп.", new Date(123, 12, 28)));
        goodsDB.add(new Milk("Молоко Цельное Городец", 539.9, 6, new Date(123, 4, 18), 930.0, 3.7));
        goodsDB.add(new Eggs("Яйцо куриное окское", 99.99, 1, new Date(2023, 6, 10), 10));
        goodsDB.add(new Drink("Квас Русский Дар Традиционный", 139.99, 1, new Date(123, 10, 25), 2000.0));
        goodsDB.add(new Lemonade("Газированный напиток Evervess Tonic", 654.00, 6, new Date(124, 4, 30), 1000.0));
        goodsDB.add(new ChildsGoods("Смесь молочная Nutrilon", 809.99, 1, 0, true));
        goodsDB.add(new Goods("Очки поляризационные для вождения Cafa France", 1469.00, 1, "шт."));
        goodsDB.add(new Hygiene("Зубная паста SENSODYNE Мгновенный эффект", 407.99, 1, 1));
        goodsDB.add(new CosmeticMask("Маска для лица очищающая детокс", 952.00, 1, 2));
        goodsDB.add(new ToiletPaper("Zewa", 389.00, 100, 8, 3));
        goodsDB.add(new Diapers("YokoSun", 1263.00, 72, 0, true, "S", 4, 7, "Одноразовые"));
        goodsDB.add(new Pacifier("Соска-пустышка Курносики латексная классическая", 339.00, 1, 0, true));

        for (Goods good : goodsDB) System.out.println(good + "\n");

    }
}
