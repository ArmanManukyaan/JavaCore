package chapter9;

public class DynStack implements IntStack {
    private int[] stack;
    private int tos;

    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }


    public void push(int item) {
        if (tos == stack.length - 1) {
            int tmp[] = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++)
                tmp[i] = stack[i];
                stack = tmp;
            stack[++tos] = item;
        } else {
            stack[++tos] = item;
        }

    }

    public int pop() {
        if (tos < 0) {
            System.out.println("stack ne sagrujen");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}