package chapter10;

public class ThrowDemo {
    static void demoroc() {
        try {
            throw new NullPointerException("demonstracia");
        } catch (NullPointerException e) {
            System.out.println("Иcключeниe перехвачено в теле метода demoproc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoroc();
        } catch (NullPointerException e) {
            System.out.println("pavtorne  pervatel:" + e.getMessage());
        }
    }
}