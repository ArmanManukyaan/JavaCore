package chapter3;

public class ClassLifeTaime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y povno" + y);
            y = 100;
            System.out.println("y teper povno" + y);
        }
    }
}
