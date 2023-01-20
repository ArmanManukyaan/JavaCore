package chapter7.Demo6;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycoub = new Box(7);
        double vol;

        vol = mybox1.volume();
        System.out.println("obyom mybox1 poven " + vol);
        vol = mybox2.volume();
        System.out.println("obyom mybox poven" + vol);
        vol = mycoub.volume();
        System.out.println("obyom mycoub roven" + vol);
    }
}
