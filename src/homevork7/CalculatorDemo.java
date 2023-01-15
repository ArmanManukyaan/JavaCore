package homevork7;

import java.util.concurrent.Callable;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        double result;

        result = myCalculator.plus(1.5, 2.5);
        System.out.println("plus :" + result);
        result = myCalculator.plus(3.8, 4.9);
        System.out.println("plus :" + result);

        result = myCalculator.minus(5.9, 3.6);
        System.out.println("minus :" + result);
        result = myCalculator.minus(10.4, 6.5);
        System.out.println("minus :" + result);

        result = myCalculator.multiply(5, 10);
        System.out.println("multiply :" + result);
        result = myCalculator.multiply(4, 4);
        System.out.println("multiply :" + result);

        result = myCalculator.divide(10 ,5);
        System.out.println("divide :"+result);

        result = myCalculator.divide(4,0);
        System.out.println(result);


    }
}
