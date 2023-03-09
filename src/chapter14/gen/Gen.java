package chapter14.gen;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

}

class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
}

class HearDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);
        Gen2<String> strOb2 = new Gen2<String>("Tecт обобщений");

        if (iOb2 instanceof Gen2<?>) {
            System.out.println("Oбъeкт iOb2 является "
                    + "экземпляром класса Gen2");
        }
        if (iOb2 instanceof Gen<?>)
            System.out.println("Oбъeкт iOb2 является "
                    + "экземпляром класса Gen");
        System.out.println();

        if (strOb2 instanceof Gen2<?>) {
            System.out.println("Oбъeкт strOb2 является "
                    + "экземпляром класса Gen2");
        }
        if (strOb2 instanceof Gen<?>) {
            System.out.println("Oбъeкт strOb2 является "
                    + "экземпляром класса Gen");
        }
        System.out.println();

        if (iOb instanceof Gen2<?>) {
            System.out.println("Oбъeкт iOb является"
                    + "экземпляром класса Gen2");
        }

        if (iOb instanceof Gen<?>) {
            System.out.println("Oбъeкт iOb является "
                    + "экземпляром класса Gen");
        }


    }
}