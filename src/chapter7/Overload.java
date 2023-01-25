package chapter7;

public class Overload {
    void test() {
        System.out.println("parametri otsustvuyut");
    }

    void test(int a, int b) {
        System.out.println("a i b :" + a + " " + b);
    }
    void test (double a){
        System.out.println("vnutreni preabrazvanie"+a);
    }

}
