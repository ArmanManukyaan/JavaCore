package homework1;

public class FigurePainter2 {
    public static void main(String[] args) {
        int x, y, k;
        for (x = 5; x < 9; x++) {
            for (y = 0; y < x; y++) {
                System.out.print("  ");
            }
            for (k = 9; k > x; k--) {
                System.out.print(" *");
            }
            System.out.println();


        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print(" *");

            }
            System.out.println();
        }
        for (int a = 5; a < 8; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int c = 7; c >= a; c--) {
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}




