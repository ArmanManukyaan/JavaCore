package chapter7.Demo6.Demo1;

public class OverLoadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int i =88;

        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);
    }
}
