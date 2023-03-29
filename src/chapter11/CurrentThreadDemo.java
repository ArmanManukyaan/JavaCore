package chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args)  {
        Thread t = Thread.currentThread();
        System.out.println("Teкyщий поток исполнения: " + t);
        t.setName("MyThread");
        System.out.println(t);

        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
