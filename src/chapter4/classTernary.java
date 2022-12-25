package chapter4;

public class classTernary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("absalyutnoe znachenie");
        System.out.println(i + "povno " + k);
        k = i < 0 ? -i : i;
        System.out.print(" absalyutne znacheni");
        System.out.println(i+"   "+k);
    }
}