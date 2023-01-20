package chapter6.Demo6.Demo4;

public class PassObJRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a i ob.b do vizva" + ob.a + " "+ob.b);

        ob.meth(ob);
        System.out.println("ob.a i ob.b posle vizva"+ob.a+" "+ob.b);
    }
}
