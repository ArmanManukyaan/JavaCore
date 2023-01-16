package chapter6;

public class Stack {
    int[] array = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }
    void push(int item) {
        if (tos == 9) {
            System.out.println("stek zapolnen");
        } else {
            array[++tos] = item;
        }
    }
        int pop () {
            if (tos == -1) {
                System.out.println("stek pustoi");
                return 0;
            }
            return array[tos--];
        }

}

