package homework;

public class IfForExample {
    public static void main(String[] args) {

        int b = 12,a=4;

        if(b>a){
            System.out.println("max"+b);

        }else{
            System.out.println("max"+a);
        }

        System.out.println("End");


        for(a = 4; a < 12; ++a) {
            System.out.println("This is a " + a);
        }

        System.out.println("End");
        char ch1 = (char)a;
        System.out.println("a " + ch1);
        char ch2 = (char)b;
        System.out.println("b " + ch2);
        System.out.println("End");
        if (a != b) {
            System.out.println("a  equal b ");
        } else {
            System.out.println("a not equal b");
        }

    }

}
