package chapter14;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    void  showTypes(){
        System.out.println("znachenie v:"+ob1.getClass().getName());
        System.out.println("znachenie 2:"+ob2.getClass().getName());
    }

    T getOb1 (){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }



}
