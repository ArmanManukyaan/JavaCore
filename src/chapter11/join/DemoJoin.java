package chapter11.join;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("odin");
        NewThread ob2 = new NewThread("dva");
        NewThread ob3 = new NewThread("tri");

        System.out.println("Пoтoк Один запущен: " + ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен: " + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен: " + ob3.t.isAlive());

        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Пoтoк Один запущен: "
                + ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен: "
                + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен: "
                + ob3.t.isAlive());
        System.out.println("Глaвный поток завершен.");
    }
    }
