package chapter7.Demo6.Demo2;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclon = new Box(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("obyom mybox1 poven" + vol);
        vol = mybox2.volume();
        System.out.println("obyom mybox2 poven" + vol);
        vol = mycube.volume();
        System.out.println("obyom kuba poven" + vol);
        vol = myclon.volume();
        System.out.println("obyom klon poven" + vol);


    }
}
