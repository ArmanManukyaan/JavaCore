package chapter5;

public class classForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i povmo " + i);
            if (i == 10)
                done = true;
            i++;

        }

    }
}
