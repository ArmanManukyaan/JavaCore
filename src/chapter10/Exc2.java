package chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d,a;

         try {
            d = 0;
            a = 42/d;
            System.out.println("et strok ne rabotaet");
        }catch (ArithmeticException e){
            System.out.println("delenie na nul");
        }
        System.out.println("helo");
    }
}
