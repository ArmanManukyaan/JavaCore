package chapter7;

public class Factorial {
    int fact(int n) {
        int result;
        if (n == 0) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }
}

