package chapter6.Demo6.Demo3;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15;
        int b = 20;

        System.out.println("a i b posle vizva " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a i b posle vizva " + a + " " + b);
    }
}
