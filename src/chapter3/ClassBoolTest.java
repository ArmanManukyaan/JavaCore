package chapter3;

public class ClassBoolTest {
    public static void main(String[] args) {

        boolean b;

        b = false;
        System.out.println("b povno" + b);
        b = true;
        System.out.println("b rovno" + b);
        if (b) {
            b = false;
            System.out.println("etot kod ne vipalnyaetsya");

        }
        if (b) {
            System.out.println("et kod ne vipalnyaetsya");


        }
        System.out.println("10 > 9"+(10>9));
    }
}
