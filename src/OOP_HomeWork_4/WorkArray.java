package OOP_HomeWork_4;

import java.util.Arrays;

public class WorkArray<T> {
    public WorkArray() {
        this.size = 0;
        this.length = 10;
        this.array = (T[]) new Object[this.length];
    }

    public WorkArray(T[] db) {
        this();
        for (T element : db) {
            this.add(element);
        }
    }

    private T[] array;
    private int size;
    private int length;

    /**
     * Добавление элемента в конец массива
     *
     * @param element Элемент
     */
    public void add(T element) {
        checkArrLen();
        array[size++] = element;
    }

    /**
     * Добавление элемента по индексу
     *
     * @param element Элемент
     * @param index   Индекс элемента
     */
    public void add(T element, int index) {
        checkArrLen();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        size++;
        array[index] = element;
    }

    /**
     * Проверка размера массива
     */
    private void checkArrLen() {
        if (size > 0 && (double) size / length > 0.75) {
            length = (int) (length * 1.25);
            array = Arrays.copyOf(array, length);
        }
        if (size > 10 && (double) size / length < 0.2) {
            length = (int) (length * 0.5);
            array = Arrays.copyOf(array, length);
        }
    }

    /**
     * Удаление элемента из массива по индексу
     *
     * @param index Индекс
     * @return Удаленный элемент
     */
    public T remove(int index) {
        T res = null;
        if (index < size) {
            res = array[index];
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
            checkArrLen();
        }
        return res;
    }

    /**
     * Удаление всех элементов с заданным значением
     *
     * @param element Элемент для поиска
     * @return Количество удаленных элементов
     */
    public int remove(T element) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                remove(i);
                count++;
            }
        }
        return count;
    }

    /**
     * Поиск минимального значения
     *
     * @param comparator
     * @return
     */
    public T min(java.util.Comparator<? super T> comparator) {
        T minRes = array[0];
        for (int i = 1; i < size; i++) {
            if (comparator.compare(minRes, array[i]) > 0)
                minRes = array[i];
        }
        return minRes;
    }

    /**
     * Поиск максимального значения
     *
     * @param comparator
     * @return
     */
    public T max(java.util.Comparator<? super T> comparator) {
        T maxRes = array[0];
        for (int i = 1; i < size; i++) {
            if (comparator.compare(maxRes, array[i]) < 0)
                maxRes = array[i];
        }
        return maxRes;
    }

    /**
     * Сумма элементов массива
     *
     * @return Сумма элементов
     * @throws Exception Исключение, при несоответствии типа
     */
    public T sum() throws Exception {
        if (array[0] instanceof Long || array[0] instanceof Integer || array[0] instanceof Short || array[0] instanceof Byte) {
            Long sumRes = 0L;
            for (int i = 0; i < size; i++)
                sumRes += ((Number) array[i]).longValue();
            return (T) sumRes;
        } else if (array[0] instanceof Double || array[0] instanceof Float) {
            Double sumRes = 0.0;
            for (int i = 0; i < size; i++)
                sumRes += ((Number) array[i]).doubleValue();
            return (T) sumRes;
        } else
            throw new Exception(array[0].getClass().getSimpleName() + " невозможно сложить");
    }

    /**
     * Произведение элементов массива
     *
     * @return
     * @throws Exception
     */
    public T multiplication() throws Exception {
        if (array[0] instanceof Long || array[0] instanceof Integer || array[0] instanceof Short || array[0] instanceof Byte) {
            Long mulRes = 1L;
            for (int i = 0; i < size; i++)
                mulRes *= ((Number) array[i]).longValue();
            return (T) mulRes;
        } else if (array[0] instanceof Double || array[0] instanceof Float) {
            Double mulRes = 1.0;
            for (int i = 0; i < size; i++)
                mulRes *= ((Number) array[i]).doubleValue();
            return (T) mulRes;
        } else
            throw new Exception(array[0].getClass().getSimpleName() + " невозможно выполнить произведение");
    }

    /**
     * Поиск индекса заданного элемента в массиве
     *
     * @param element
     * @return Индекс массива (возвращает "-1" если нет совпадений)
     */
    public Integer find(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(this.array[i])) return i;
        }
        return -1;
    }

    /**
     * Проверка наличия элемента в массиве
     *
     * @param element
     * @return
     */
    public boolean isExist(T element) {
        return this.find(element) != -1;
    }

    /**
     * Сортировка пузырьком
     *
     * @param comparator
     */
    public void bubbleSort(java.util.Comparator<? super T> comparator) {
        for (int j = 1; j < size; j++) {
            Boolean isSorted = true;
            for (int i = 0; i < size - j; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    T tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    /**
     * Сортировка простыми вставками
     *
     * @param comparator
     */
    public void insertionSort(java.util.Comparator<? super T> comparator) {
        for (int j = 1; j < size; j++) {
            T key = array[j];
            int i = j - 1;
            while ((i >= 0 && comparator.compare(array[i], key) > 0)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    /**
     * Сортировка простым выбором
     *
     * @param comparator
     */
    public void selectionSort(java.util.Comparator<? super T> comparator) {
        for (int i = 0; i < size - 1; ++i) {
            int minPos = i;
            for (int j = i + 1; j < size; ++j) {
                if (comparator.compare(array[j], array[minPos]) < 0) {
                    minPos = j;
                }
            }
            T tmp = array[minPos];
            array[minPos] = array[i];
            array[i] = tmp;
        }
    }

    /**
     * Получение элемента по индексу
     *
     * @param index
     * @return
     */
    public T get(int index) {
        if (index > 0 && index < size) return array[index];
        else return null;
    }

    /**
     * Замена элемента
     *
     * @param element Новый элемент
     * @param index   Индекс
     * @return Старое значение элемента
     */
    public T replace(T element, int index) {
        if (index > 0 && index < size) {
            T oldElement = array[index];
            array[index] = element;
            return oldElement;
        } else return null;
    }

    /**
     * Печать массива
     */
    public void printArray() {
        System.out.println(array);
    }

    /**
     * Получение размера массива
     *
     * @return
     */
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size; i++) {
            str.append(array[i].toString());
            if (i != size - 1) str.append(", ");
        }
        str.append("]");
        return str.toString();
    }
}
