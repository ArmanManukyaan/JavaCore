package chapter7;

public class Stack {
    private int[] stack = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("stek zapolnen");
        } else
            stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("steck ne zagrujen");
            return 0;
        } else
            return stack[tos--];

    }
}

