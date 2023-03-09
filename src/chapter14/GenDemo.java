package chapter14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println(v);
        System.out.println();

        Gen<String> strOB = new Gen<String>("texstavoi sabshenie");
        strOB.showType();
        String str = strOB.getOb();
        System.out.println("zanchenie :" + str);

    }
}
