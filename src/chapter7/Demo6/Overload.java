package chapter7.Demo6;

public class Overload {
    void test() {
        System.out.println("parametri otsustvuyut");
    }

    void test(int a) {
        System.out.println("a :" + a);
    }

    void test(int a, int b) {
        System.out.println("a i b:" + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }


}
