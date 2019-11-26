package random.epm.$11;

public class ThreadTest {

    static class MyThread extends Thread {
        MyThread(Runnable target) {
            super(target);
        }

        @Override
        public void run() {
            System.out.println("In my thread!");
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("In the my runnable!");
        }
    }

    public static void main(String[] args) {
        new MyThread(new MyRunnable()).start(); // In my thread!
        new MyThread(new MyRunnable()).run(); // In my thread!

        new Thread(new MyRunnable()).start(); // In the my runnable!
    }

}
