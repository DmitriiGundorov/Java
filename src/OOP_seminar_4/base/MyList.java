package OOP_seminar_4.base;

/**
 * Обычный Мой список с тепичными методами для любых Объектов
 */
public interface MyList<T> {
    /**
     * Добавление в конец списка массива элементов
     * @param arrayItem Массив элементов
     */
    void append(T[] arrayItem);

    /**
     * Добавление в конец списка элемент
     * @param item элемент
     */
    void append(T item);

    /**
     * Удаление элемента по индексу
     * @param index индекс
     * @return  Удаленный элемент
     */
    T removeOfIndex(int index);

    /**
     * Удаление всех элементов с заданным значением
     * @param item заданное значение
     */
    void removeAllItem(T item);
    /**
     * Удаление всех элементов
     */
    void removeAll();

    /**
     * Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     * @param item Заданный элемент
     * @return Индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     */
    int getIndex(T item);

    /**
     * Проверка наличия элемента в массиве
     * @param item Элемент
     * @return true, если элемент в массиве есть, false – нет.
     */
    boolean isContain(T item);

    /**
     * Получение элемента массива по индексу
     * @param index Индекс
     * @return Элемента массива по индексу
     */
    T getItem(int index);

    /**
     * Задание значения элементу массива с заданным индексом
     * @param item Элемент
     * @param index Индекс Массива
     */
    void setItem(T item,int index);

    /**
     *  Печать массива на экран
     */
    void printArray();

    /**
     * Длинна массива
     * @return Длинна массива
     */
    int getCountItems();

}
