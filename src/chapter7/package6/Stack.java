package chapter7.package6;

public class Stack {

    private int stack[];
    private int tos;

    Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length) {
            System.out.println("stek zapolnen");
        } else
            stack[++tos] = item;
    }
    int pop(){
        if(tos<0){
            System.out.println("stek zagrujen");
            return 0;
        }else
          return   stack[tos--];
    }
}
