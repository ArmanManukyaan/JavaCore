package chapter8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        Box maybox = new Box();
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("obyom mybox1 roven :" + vol);
        System.out.println("ves maybox1 raven :" + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("obyom maybox2 raven :" + vol);
        System.out.println("ves maybox2 raven :" + mybox2.weight);
    }
}
