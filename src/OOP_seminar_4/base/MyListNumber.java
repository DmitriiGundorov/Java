package OOP_seminar_4.base;

import java.util.Comparator;

public interface MyListNumber<T extends Number > extends MyList, AllSorting {
    /**
     * Получить Максимальное значение массива
     * @return Максимальное значение массива
     */
    T getMax();

    /**
     * Получить индекс Максимального значение массива
     * @return индекс Максимального значение массива
     */
    int getMaxIndex();

    /**
     * Получить Минимальное значение массива
     * @return Получить Минимальное значение массива
     */
    T getMin();

    /**
     * Получить индекс Минимального значение массива
     * @return индекс Минимального значение массива
     */
    int getMinIndex();

    /**
     * Поиск суммы элементов массива
     * @return Сумма элементов массива
     */
    T getSum();

    T getProducts();


}
