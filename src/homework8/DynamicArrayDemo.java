package homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray myArray = new DynamicArray();
        for (int i = 1; i < 20; i++) {
            myArray.add(i);
        }
        myArray.print();

        System.out.println();

        System.out.print(myArray.getByIndex(0) + " ");
         System.out.print(myArray.getByIndex(1) + " ");

        System.out.println();


        System.out.println(myArray.getIndexByValue(1));
        myArray.print();




    }
}
