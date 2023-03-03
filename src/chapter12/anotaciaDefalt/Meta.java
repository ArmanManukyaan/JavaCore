package chapter12.anotaciaDefalt;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno()
    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> с = ob.getClass();
            Method m = с.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exs) {
            System.out.println("Meтoд не найден.");
        }
    }

    public void main(String[] args) {
        myMeth();


    }
}
