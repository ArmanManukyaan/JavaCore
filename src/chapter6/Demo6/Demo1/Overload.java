package chapter6.Demo6.Demo1;

public class Overload {
    void test(){
        System.out.println("parametri osustvuyut");
    }
    void test(int a,int b){
        System.out.println("a i n :"+a+" "+b);
    }
    void test(double a){
        System.out.println("vnutreni preabrazvanie pri vizva metoda test (double) :"+a);
    }
}
