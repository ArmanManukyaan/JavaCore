package chapter7.package4;

public class CallByValue {
    public static void main(String[] args) {
        Test test = new Test();
        int a = 15;
        int b = 20;
        System.out.println("a i b do vizva :" + a + " " + b);
        test.meth(a, b);
        System.out.println("a i b posle vizva:" + a + " " + b);
    }
}
