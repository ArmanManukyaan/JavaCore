package chapter8.callme;

public class A {
    void callme(){
        System.out.println("B metod callme() iz klass A");
    }
}
class B extends  A{
    void callme(){
        System.out.println("B metod callme iz klass B");
    }
}
class C extends B{

    void callme() {
        System.out.println("B metod calme iz klass C");
    }
}