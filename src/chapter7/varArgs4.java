package chapter7;

public class varArgs4 {

    static void vaTest(int... v) {
        System.out.print("vaTest(int...):" + "kalichestva argumentov :" + v.length + "saderjimoe");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean):" + "kalichestva argumentov :" + v.length + "saderjimoe");
        for(boolean x : v){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,false,false);
       // vaTest(); oshibka
    }
}
