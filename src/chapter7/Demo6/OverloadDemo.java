package chapter7.Demo6;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload op = new Overload();
        double result;

        op.test();
        op.test(10);
        op.test(10, 20);
        result = op.test(123.25);
        System.out.println("rezultat vizova op.test(123.5): " + result);
    }
}

