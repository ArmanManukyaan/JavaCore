package homework5;

public class ArraySort {
    public static void main(String[] args) {
        int numbers[] = {43, 55, 5, -9, 0, 12, 5, 65};
        int result;
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers.length; j++) {
                 if (numbers[i] > numbers[j]) {
                    result = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = result;
                }
            }
        for(int j = 0;j<numbers.length;j++){
            System.out.print(numbers[j]+ " ");

        }

        }


    }




































