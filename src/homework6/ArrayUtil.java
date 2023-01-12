package homework6;

public class ArrayUtil {
    void maxelement(int[] array) {
        int maxArray = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];

            }
        }
        System.out.println(" max : " + maxArray);
    }

    void sortelement(int[] array) {
        int result;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    result = array[i];
                    array[i] = array[j];
                    array[j] = result;
                }
            }
        }
        System.out.println("Big to Small");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        System.out.println("even number");


    }

    void evennumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void chars(char[] chars) {
        char c = 'o';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c){
            }

        }
        System.out.print("syumbol :"+c);

    }

}
