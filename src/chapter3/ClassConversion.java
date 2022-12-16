package chapter3;

public class ClassConversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        b = (byte) i;
        System.out.println("b ev i" + i + " " + b);

        i = (int) d;
        System.out.println("d ev i" + d + " " + i);

        b = (byte) d;
        System.out.println("b ev d" +d+ " "+b);
    }
}
