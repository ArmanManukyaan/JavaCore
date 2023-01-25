package chapter7.package6;

public class TestStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack(5);
        Stack stack2 = new Stack(8);

        for (int i = 0; i < 5; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            stack2.push(i);
        }
        System.out.println("stack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack1.pop());
        }
        System.out.println("stack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(stack2.pop());
        }

    }
}
