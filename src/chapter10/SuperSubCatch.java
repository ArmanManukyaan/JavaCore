package chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int а = 0;
            int b = 42 / а;
        } catch (Exception е) {
            System.out.println(
                    "Перехват исключений общего класса Exception.");
        }
    }
}