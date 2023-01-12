package homework6;

public class ArrayDemo {
    public static void main(String[] args) {

        ArrayUtil Array = new ArrayUtil();
        int[] array = {6, 5, 22, 33, 55, 35, 7};
        Array.maxelement(array);
        Array.sortelement(array);
        Array.evennumbers(array);

        ArrayUtil Char = new ArrayUtil();
        char[] chars = {'j','a','v','a','l','o','v','e'};
        Array.chars(chars);


    }

}
