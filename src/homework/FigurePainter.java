package homework;

public class FigurePainter {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("* ");
            System.out.println();

        }
        System.out.println("end");

        for (int x = 5; x > 0; x--) {
            for (int y = 0; y < x; y++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("end");


        int i, j, k, b = 6 ;

        for (i = 0; i <= b; i++) {
            for (j = 1; j <= b - i; j++) {
                System.out.print(" ");

            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
