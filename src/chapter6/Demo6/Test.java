package chapter6.Demo6;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = 5;
        b = j;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        }else{
         return    false;
        }
    }

}
