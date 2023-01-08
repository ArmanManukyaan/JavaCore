package homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int num = 0;
        for (int x : chars) {
            if (x == c) {
                num++;
                System.out.println("Symbol :" + " " + c);
            }
        }
        System.out.println("quantity :" + num);
        System.out.println();

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println(chars2[(chars2.length / 2 - 1)] + " " + chars2[chars2.length / 2]);

        System.out.println();

        char chars3[] = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean result = chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y';

        System.out.println(result);

        System.out.println();

        char text[] = {' ', ',', 'b', 'a', 'r', 'e', 'v', ',', ' '};

        for (char aChar : text) {

            if (aChar != ' ') {
                System.out.print(aChar);
            }

        }
    }
}





