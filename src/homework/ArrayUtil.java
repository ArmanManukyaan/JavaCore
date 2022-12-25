package homework;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {11, 3, 6, 8, 10, 12, 33, 17, 19, 16};
        int arrayMin = array[0];
        int arrayMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < arrayMin) {
                arrayMin = array[i];
            }
            System.out.print(array[i] + " ");

            if (array[i] > arrayMax) {
                arrayMax = array[i];
            }

        }
        System.out.println();
        System.out.println(" min " + arrayMin);
        System.out.println("max" + arrayMax);
        System.out.println();


        int numArray[] = {4, 7, 10, 5, 3, 6, 9, 8};
        int result = 0;

        for (int a = 0; a < numArray.length; a++) {
            result = result + numArray[a];

        }
        System.out.println("Average number : " + result / 8);
        System.out.println("Sum of numbers :" + result);
        System.out.println("First element :" + numArray[0]);
        int lastIndex = numArray.length - 1;
        System.out.println("Last element :" + numArray[numArray.length - 1]);
        int MiddleIndex = numArray.length / 2;
        System.out.print("MiddleIndex :" + numArray[numArray.length / 2]);

        System.out.println();
        System.out.println("Even number");

        int evenArray = 0;
        for (int a = 0; a < numArray.length; a++) {
            if (numArray[a] % 2 == 0) {
                evenArray++;
                System.out.print(numArray[a] + "  ");

            }
        }
        System.out.print("quantity : " + evenArray);
        System.out.println();
        System.out.println("odd numbers");


        int oddArray = 0;
        for (int b = 0; b < numArray.length; b++) {
            if (numArray[b] % 2 != 0) {
                oddArray++;
                System.out.print(numArray[b] + " ");
            }
        }
        System.out.println("quantity " + oddArray);

    }


}





















