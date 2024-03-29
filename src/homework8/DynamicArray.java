package homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public void extend() {
        int result[] = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        array = result;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("wrong index");

        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println("wrong index");
            return;
        }
        array[index] = value;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("wrong index");
        }
        if (size == array.length) {
            extend();
        }

        for (int i = size; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }

        }
        return false;

    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }

        }
        return -1;
    }
}























































