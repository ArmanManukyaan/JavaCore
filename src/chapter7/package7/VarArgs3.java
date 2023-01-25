package chapter7.package7;

public class VarArgs3 {
    static void varTest(int... v) {
        System.out.print("vaTest(int ) :" + "kalishestva argumentov" + v.length + "saderjimoe");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void varTest(boolean... v) {
        System.out.print("boolean(boolean...) :" + "kalichestva argumentav:" + v.length + "saderjimoe");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void varTest(String msg, int... v) {
        System.out.print("vaTest(String,int... ):" + msg + v.length + "saderjimoe");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varTest(1, 2, 3);
        varTest("praverka a:", 10, 20);
        varTest(true, false, false);
    }
}
