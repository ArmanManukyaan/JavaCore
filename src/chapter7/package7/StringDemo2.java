package chapter7.package7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 ="pervaya strok";
        String strOb2 ="vtaraya strok";
        String strOb3 =  strOb1;
        System.out.println("dlina stroka strOb1 :"+strOb1.length());
        System.out.println("simvol pa indexu 3 :"+strOb1.charAt(3));

        if(strOb1.equals(strOb2)) {
            System.out.println("strOb1 == strOb2");
        } else
            System.out.println("strOb1 != strOb2");
        if(strOb1.equals(strOb3)){
            System.out.println("strOb1 == strOb3");
        }else
            System.out.println("strOb1 != strOb3");


    }
}
