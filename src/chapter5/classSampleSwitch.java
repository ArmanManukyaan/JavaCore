package chapter5;

public class classSampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i rovno nulya ");
                    break;
                case 1:
                    System.out.println("i povno edinci");
                    break;
                case 2:
                    System.out.println("i povno dvum");
                    break;
                case 3:
                    System.out.println("i povno trem");
                    break;
                default :
                    System.out.println("i bolshe trex");

            }
        }
    }
}

