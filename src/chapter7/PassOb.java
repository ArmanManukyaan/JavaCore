package chapter7;

public class PassOb {
    public static void main(String[] args) {
        Test test1 = new Test(100, 22);
        Test test2 = new Test(100, 22);
        Test test3 = new Test(-1, -1);
        System.out.println("test1==test2" + test1.equalTo(test2));
        System.out.println("test2==test3" + test1.equalTo(test3));
    }
}
