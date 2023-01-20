package chapter6.Demo6.Demo5;

public class Test {
    int a;
    Test(int i) {
        a = i;
    }
    Test incrByTen() {
        Test temp = new Test(a + 10);
           return temp;



    }
}
