package OOP_seminar_4;

import OOP_seminar_4.base.MyListNumber;

import java.nio.channels.NotYetBoundException;

public class MyArrayList <T extends Number> implements MyListNumber {
    private T[] items;
    private int size;
    private static int secretCount = 100;
    private static double percentDown = .75;

    public MyArrayList() {
        items = (T[]) new Number[secretCount];
        System.out.println(items.length);
        size = 0;
    }
    /**
     * Создать Список с массивам
     * @param itemsArray массив
     */
    public MyArrayList(T[] itemsArray) {
        if((int)(secretCount*percentDown) <=  (itemsArray.length)){
            secretCount = (int) (items.length / percentDown);
            items = (T[]) new Number[secretCount];
        }else{
            items = (T[]) new Number[secretCount];
        }
        size = itemsArray.length;
        for (int i = 0; i < size; i++) {
            items[i] = itemsArray[i];
        }
    }
    /**
     * Пузырковая сортировка
     */
    @Override
    public void bubbleSorting() {
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size-i; j++) {
                if(items[j-1].doubleValue() > items[j].doubleValue()){
                    var temp = items[j-1];
                    items[j-1] = items[j];
                    items[j] = temp;
                }
            }
        }
    }
    /**
     * Получить Максимальное значение массива
     *
     * @return Максимальное значение массива
     */
    @Override
    public T getMax() {
        var max = items[0];
        for (int i = 1; i < size ; i++) {
            if (max.doubleValue() < (this.items[i].doubleValue())) max = items[i];
        }
        return max;
    }
    /**
     * Получить индекс Максимального значение массива
     *
     * @return индекс Максимального значение массива
     */
    @Override
    public int getMaxIndex() {
        var max = 0;
        for (int i = 1; i < size ; i++) {
            if (items[max].doubleValue() < (this.items[i].doubleValue())) max = i;
        }
        return max;
    }
    /**
     * Получить Минимальное значение массива
     *
     * @return Получить Минимальное значение массива
     */
    @Override
    public T getMin() {
        // Крайний случай
        var min = items[0];
        for (int i = 1; i < size ; i++) {
            if (min.doubleValue() > this.items[i].doubleValue()) min = items[i];
        }
        return min;
    }
    /**
     * Получить индекс Минимального значение массива
     *
     * @return индекс Минимального значение массива
     */
    @Override
    public int getMinIndex() {
        var min = 0;
        for (int i = 1; i < size ; i++) {
            if (items[min].doubleValue() > (this.items[i].doubleValue())) min = i;
        }
        return min;
    }
    /**
     * Поиск суммы элементов массива
     *
     * @return Сумма элементов массива
     */
    @Override
    public T getSum() {
        Double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum= sum + items[i].doubleValue();
        }
        return (T) sum;
    }
    /**
     * Поиск произведения элементов массива
     *
     * @return произведения элементов массива
     */
    @Override
    public T getProducts() {
        Double products = 1.;
        for (int i = 0; i < size; i++) {
            products=products*items[i].doubleValue();
        }
        return (T) products;

    }
    /**
     * Добавление в конец списка массива элементов
     *
     * @param arrayItem Массив элементов
     */
    @Override
    public void append(Object[] arrayItem) {
        if((size+arrayItem.length) >= secretCount){
            secretCount = (int)((size+arrayItem.length) / percentDown);
            var temp = items;
            items = (T[]) new Number[secretCount];
            for (int i = 0; i < size; i++) {
                items[i] = temp[i];
            }
            append(arrayItem);
        }else {
            for (int i = 0; i < arrayItem.length; i++) {
                items[size+i] = (T) arrayItem[i];
            }
            size+=arrayItem.length;
        }
    }

    /**
     * Добавление в конец списка элемент
     *
     * @param item элемент
     */
    @Override
    public void append(Object item) {
        if(size >= secretCount){
            secretCount = (int)((size+1) / percentDown);
            var temp = items;
            items = (T[]) new Number[secretCount];
            for (int i = 0; i < size; i++) items[i] = temp[i];
            append(item);
        }else {
            items[size] = (T) item;
            size++;
        }
    }
    /**
     * Удаление элемента по индексу
     *
     * @param index индекс
     * @return Удаленный элемент
     */
    @Override
    public T removeOfIndex(int index) {
        T res = items[index];
        for (int i = index+1; i < size; i++) items[i-1] = items[i];
        size--;
        return res;
    }
    /**
     * Удаление всех элементов с заданным значением
     *
     * @param item заданное значение
     */
    @Override
    public void removeAllItem(Object item) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if(items[i].equals(item)) counter++;
            items[i] = items[i+counter];
        }
        size=size-counter;
    }
    /**
     * Удаление всех элементов
     */
    @Override
    public void removeAll() {
        size=0; // Изи
    }
    /**
     * Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     *
     * @param item Заданный элемент
     * @return Индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     */
    @Override
    public int getIndex(Object item) {
        for (int i = 0; i < size; i++) if (items[i].equals(item)) return i;
        return -1;
    }
    /**
     * Проверка наличия элемента в массиве
     *
     * @param item Элемент
     * @return true, если элемент в массиве есть, false – нет.
     */
    @Override
    public boolean isContain(Object item) {
        for (int i = 0; i < size; i++) if (items[i].equals(item)) return true;
        return false;
    }
    /**
     * Получение элемента массива по индексу
     *
     * @param index Индекс
     * @return Элемента массива по индексу
     */
    @Override
    public Number getItem(int index) {
        return items[index];
    }
    /**
     * Задание значения элементу массива с заданным индексом
     *
     * @param item  Элемент
     * @param index Индекс Массива
     */
    @Override
    public void setItem(Object item, int index) {
        items[index]=(T) item;
    }
    /**
     * Печать массива на экран
     */
    @Override
    public void printArray() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(items[i]+", ");
        }
        System.out.println("]");
    }
    /**
     * Длинна массива
     *
     * @return Длинна массива
     */
    @Override
    public int getCountItems() {
        return size;
    }
    /**
     * Сортировка простыми вставками
     */
    @Override
    public void simpleInsertSorting() {
        int j;
        for (int i = 1; i < size; i++) {
            T swap = items[i];
            for (j = i; j > 0 && (swap.doubleValue()<items[j-1].doubleValue()); j--) {
                items[j] = items[j-1];
            }
            items[j] = swap;
        }
    }
    /**
     * Сортировка простым выбором
     */
    @Override
    public void simpleSelectionSorting() {
        for (int i = 0; i < items.length; i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;
            for (int j = i  + 1; j < items.length; j++) {
                if (items[j].doubleValue() < items[min].doubleValue()) {
                    min = j;
                }
            }
            swap(i, min);
        }
    }

    private void swap(int a, int b){
        T swap = items[a];
        items[a] = items[b];
        items[b] = swap;
    }

    public T[] clone(){
        T[] temp = (T[])new Number[size];
        for (int i = 0; i < size; i++) {
            temp[i] = items[i];
        }
        return temp;
    }
    private T[] clone(int count){
        T[] temp = (T[])new Number[size];
        for (int i = 0; i < size; i++) {
            temp[i] = items[i];
        }
        return temp;
    }
}
