package OOP_seminar_4;

public class Program {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
        myArrayList1.printArray();
        Number[] integers = new Number[]{1,3,5,7,8,-1, 91.1f, 5};
        MyArrayList<Number> myArrayList2 = new MyArrayList<>(integers);
        myArrayList2.printArray();
        System.out.println(myArrayList2.getMax());// 91
        System.out.println(myArrayList2.getMin()); // -1
        System.out.println(myArrayList2.getSum()); // 114
        myArrayList2.removeOfIndex(4);
        myArrayList2.printArray();
        myArrayList2.removeAllItem(5);
        myArrayList2.printArray();

        myArrayList1.append(integers);
        myArrayList1.printArray();
        myArrayList1.append(4);
        myArrayList1.simpleInsertSorting();
        myArrayList1.printArray();
    }
}
