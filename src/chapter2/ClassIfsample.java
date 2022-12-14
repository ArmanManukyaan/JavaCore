package chapter2;

public class ClassIfsample {
    public static void main(String[] args) {
        int x, y;
        x = 10;

        y = 20;

        if (x < y) {
            System.out.println("x poqre y");
            x = x * 2;

            if (x == y) {
                System.out.println("x havasar y");

                x = x * 2;
                if (x > y) {
                    System.out.println("x met y");
                    if(x==y){
                        System.out.println("bare");
                    }

                }

            }
        }
    }
}
