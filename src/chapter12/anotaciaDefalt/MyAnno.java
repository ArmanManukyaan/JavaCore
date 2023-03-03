package chapter12.anotaciaDefalt;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}
