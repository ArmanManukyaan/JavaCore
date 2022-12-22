package homework;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {11, 3, 6, 8, 10, 12, 33, 17, 19, 16};
        int array_min = array[0];
        int array_max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array_min) {
                array_min = array[i];
            }
            System.out.print(array[i] + " ");

            if (array[i] > array_max) {
                array_max = array[i];
            }

        }
        System.out.println();
        System.out.println(" min " + array_min);
        System.out.println("max" + array_max);

    }


}















