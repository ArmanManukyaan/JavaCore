package chapter14;

public class GenCos <T> {
    private double val;

    <T extends Number >
    GenCos(T arg) {
       val = arg.doubleValue();
    }

    void showval() {
        System.out.println("val: " + val);
    }
}

class GenConsDemo {
    public static void main(String[] args) {
        GenCos test1 = new GenCos(100);
        GenCos test2 = new GenCos(123.5F);
        test1.showval();
        test2.showval();
    }
}
