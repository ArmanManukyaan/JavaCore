package chapter9;

public class IFTest3 {
    public static void main(String[] args) {
        DynStack ds  = new  DynStack(5);
        FixedStack fs  = new FixedStack(8);
        IntStack mystack;

        mystack = ds;
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }
        mystack = fs;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }
        mystack = ds;
        System.out.println("Dystack pop");
        for (int i = 0; i < 12; i++) {
            System.out.println(mystack.pop());
        }
        mystack = fs;
        System.out.println("Fixstack pop");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack.pop());
        }
    }
}
