package chapter11;

public class ThreadExample {
    public static void main(String[] args) {
        Thread myNewThread  = new Thread(new MyThread(),"MyThread");
        myNewThread.start();
        for (int i = 1; i < 6; i++) {
            System.out.println("MainThread " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}