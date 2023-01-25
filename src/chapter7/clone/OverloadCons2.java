package chapter7.clone;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        Box myclone = new Box(mybox1);
        double vol;

        vol = mybox1.test();
        System.out.println("obyom rovem:" + vol);
        vol = mybox2.test();
        System.out.println("obyom roven:" + vol);
        vol = mybox3.test();
        System.out.println("obyom roven:"+vol);
        vol = myclone.test();
        System.out.println("obyom roven mybox1:"+vol);
    }

}

