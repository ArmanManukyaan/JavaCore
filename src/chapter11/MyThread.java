package chapter11;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("MyThrad " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
