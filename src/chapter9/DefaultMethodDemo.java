package chapter9;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        MyIFImp2 obj1 = new MyIFImp2();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
        System.out.println(obj1.getString());
        System.out.println(obj1.getNumber());
    }
}