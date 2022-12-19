package homework;

public class FigurePainter {
    public static void main(String[] args) {

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print("*");

            }
            System.out.println();

        }
        int i, j, k, n = 5;

        for (i = 0; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int x = 5; x > 0; x--) {
            for (int y = 0; y < x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}



