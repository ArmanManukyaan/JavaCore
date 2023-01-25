package chapter7;

public class VarArgs2 {
    static void varTest(String msg, int... v) {
        System.out.print(msg + v.length + "saderjimoe");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        varTest("odin parametr peremenoi dlini :", 10);
        varTest("tri parametr permenoi dlini :", 1, 2, 3);
        varTest("bez parametr peremenoi dlini :");
    }
}
