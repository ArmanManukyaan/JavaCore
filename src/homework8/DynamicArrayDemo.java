package homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray myArray = new DynamicArray();

        myArray.add(5);
        myArray.add(7);
        myArray.add(2);
        myArray.add(4);
        myArray.add(42);
        myArray.add(22);
        myArray.add(34);
        myArray.add(40);
        myArray.add(87);
        myArray.add(12);
        myArray.add(20);
        myArray.add(21);
        myArray.add(14);
        myArray.add(41);
        myArray.add(33);
        myArray.add(23);
        myArray.add(22);
        myArray.add(21);
        myArray.add(11);
        myArray.print();

        System.out.println();

        System.out.print(myArray.getByIndex(2) + ", ");
        System.out.print(myArray.getByIndex(3) + " ,");
        System.out.print(myArray.getByIndex(9) + " ,");



    }
}
