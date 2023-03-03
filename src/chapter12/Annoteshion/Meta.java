
package chapter12.Annoteshion;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Primer Anatoci", val = 100)
    public static void myMet() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMet");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exs) {
            System.out.println("Meтoд не найден.");
        }


    }

    public static void main(String[] args) {
        myMet();
    }
}


