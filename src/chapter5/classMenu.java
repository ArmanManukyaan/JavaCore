package chapter5;

public class classMenu {
    public static void main(String[] argsIOException) throws java.io.IOException{
            char choice;
            do {
                System.out.println("spravka po operatru");
                System.out.println("    1.if");
                System.out.println("    2.switch");
                System.out.println("    3.while");
                System.out.println("    4.do-while");
                System.out.println("    5.for/n");
                System.out.println("viberite nujni punkt");
                choice = (char) System.in.read();
            } while (choice < '1' || choice > '5');
            System.out.println("\n");
            switch (choice) {
                case '1':
                    System.out.println("if:\n");
                    System.out.println("if(uslovni)operator;");
                    System.out.println("else operator");
                    break;
                case '2':
                    System.out.println("switch:\n");
                    System.out.println("switch(virajenie){");
                    System.out.println("case konstant:");
                    System.out.println("pasled opertrov");
                    System.out.println("break;");
                    System.out.println("//....");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("while:\n");
                    System.out.println("whlie(yslovya)operator;");

                    break;
                case '4':
                    System.out.println("do-while:\n");
                    System.out.println("do{");
                    System.out.println("   operator;");
                    System.out.println("} while (uslobie);");
                    break;
                case '5':
                    System.out.println("for:\n");
                    System.out.println("for(incilizacia; uslovie; interacia)");
                    System.out.println("operator;");
                    break;


            }
        }
    }

