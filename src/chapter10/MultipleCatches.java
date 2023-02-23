package chapter10;

public class MultipleCatches {
    public static void main(String args[]) {
        try {
            int а = args.length;
            System.out.println("a " + а);
            int b = 42 / а;
            int с[] = {1};
            с[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Дeлeниe на нуль: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Oшибкa индексации за пределами " + e);
        }
        System.out.println(
                "После блока операторов try/catch.");
    }
}


