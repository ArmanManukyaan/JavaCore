package chapter12.anoteshion;


import java.lang.annotation.*;
import java.lang.reflect.*;

@What(description = "Аннотация тестового класса")
@MyAnno(str = "Meta", val = 99)
public class Meta {
    @What(description = "Аннотация тестового метода")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();
        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("Bce аннотации для класса Meta:");
            for (Annotation a : annos)
                System.out.println(a);

            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Meтoд не найден.");


        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}