package chapter5;

public class classForEach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.println("znachenie povno :" + x);
            sum += x;

        }
        System.out.println("sum robno :"+sum);

    }
}
