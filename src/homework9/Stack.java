package homework9;

public class Stack {
    private int[] array = new int[10];
    private int tos;


    Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        }
        array[++tos] = item;
    }

    public int pop(int item) {
        if (tos < 0) {
            System.out.println("Stack not full");
            return 0;
        }
        return array[tos--];
    }
}
