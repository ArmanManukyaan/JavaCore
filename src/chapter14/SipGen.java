package chapter14;

public class SipGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "obabshenie");
        tgObj.showTypes();
        int v = tgObj.getOb1();
        System.out.println("znachenie :" + v);
        String str = tgObj.getOb2();
        System.out.println("znachenie str:" + str);

    }
}
