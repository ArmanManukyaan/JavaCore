package chapter5;

public class classBreakLoop2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i == 10) {
                break;

            }
            System.out.println("i:" + i);
            i++;
        }
        System.out.println("cikl zavershon");

    }
}
