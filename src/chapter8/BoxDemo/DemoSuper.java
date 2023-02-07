package chapter8.BoxDemo;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("obyom maybox1 raven " + vol);
        System.out.println("ves maybox1 raven" + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("obyum maybox2 raven " + vol);
        System.out.println("ves maybox2 raven " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("obyom maybox3 " + vol);
        System.out.println("ves maybox3 raven " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("obyom macclone3 raven " + vol);
        System.out.println("ves mayclone raven " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("obyom maycube rave " + vol);
        System.out.println("ves maycube raven " + mycube.weight);
        System.out.println();
    }
}
