package homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;
    DynamicArray() {
        size = 0;
    }
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }
    public void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        array = result;
    }
    public int getByIndex(int index) {
        if (array[index] >= 0 && array[index] < size){
            return array[index];
        }else {
            return -1;
        }
        }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }


    }
}












































