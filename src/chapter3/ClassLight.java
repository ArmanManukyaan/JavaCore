package chapter3;

public class ClassLight {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distancie;

        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distancie = lightspeed * seconds;

        System.out.print("za" + days);
        System.out.println("dnei svet praydot okolo");
        System.out.println(distancie + "mil");

    }
}
