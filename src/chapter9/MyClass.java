package chapter9;

public class MyClass implements B {
    @Override
    public void meth1() {
        System.out.println("realizacia metoda meth1.");
    }

    public void meth2() {
        System.out.println("realixacia metoda meth2.");
    }

    @Override
    public void meth3() {
        System.out.println("realizacia metod met3");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();
        myClass.meth3();
    }
}

