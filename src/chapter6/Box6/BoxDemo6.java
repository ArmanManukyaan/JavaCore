package chapter6.Box6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 =new Box();
        Box mybox2 =new Box();
        double vol;


        vol = mybox1.volume();
        System.out.println("obyum"+vol);
        vol = mybox1.volume();
        System.out.println(vol);
    }
}
