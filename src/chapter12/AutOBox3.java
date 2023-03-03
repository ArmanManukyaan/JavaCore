package chapter12;

import java.util.ArrayList;

public class AutOBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;
        iOb = 100;
        System.out.println("isxodni znachenie:" + iOb);
        ++iOb;
        System.out.println("posle ++iOb " + iOb);
        iOb2 = iOb + (iOb / 2);
        System.out.println("iOb2 после выражения:"+iOb2);
        i = iOb + (iOb / 3);
        System.out.println("i после выражения: " + i);
    }
}