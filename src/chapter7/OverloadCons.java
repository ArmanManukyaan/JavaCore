package chapter7;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        double vol;

        vol = mybox1.volume();
        System.out.println("obyom mybox1 poven :" + vol);
        vol = mybox2.volume();
        System.out.println("obyom mybox2 poven :" + vol);
        vol = mybox3.volume();
        System.out.println("obyom mybox3 poven :" + vol);

    }
}
