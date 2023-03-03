package chapter12.Appal;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Яблoкo сорта Winesap стоит" +
                Apple.Winesap.getPrise() + " центов. \n");
        for (Apple a : Apple.values()) {
            System.out.println(a + " стоит " + a.getPrise() + " центов ");
        }
    }
}