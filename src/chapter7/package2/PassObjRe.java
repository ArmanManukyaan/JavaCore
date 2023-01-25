package chapter7.package2;

public class PassObjRe {
    public static void main(String[] args) {
        Test test = new Test(15,20);
        System.out.println("o.a i o.b do vizva:"+test.a+" "+test.b);
        test.meth(test);
        System.out.println("test.a i test.b :"+test.a+" "+test.b);
    }
}
