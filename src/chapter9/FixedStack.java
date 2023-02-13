package chapter9;
public class FixedStack implements IntStack {
    private int stack[];
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
    System.out.println("stack mystack2");
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length-1) {
            System.out.println("stek zaplonen");
        } else {
            stack[++tos] = item;
        }
    }
    public int pop() {
        if (tos < 0) {
            System.out.println("stack ne zagrujen");
            return 0;
        } else
            return stack[tos--];

    }
}

