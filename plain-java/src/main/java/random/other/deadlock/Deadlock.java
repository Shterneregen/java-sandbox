package random.other.deadlock;

public class Deadlock {

	public static void main(String[] args) {
		final Object lock1 = new Object();
		final Object lock2 = new Object();

		final Thread1 thread1 = new Thread1(lock1, lock2);
		final Thread2 thread2 = new Thread2(lock1, lock2);

		thread1.start();
		thread2.start();
	}
}

class Thread1 extends Thread {
	private final Object lock1;
	private final Object lock2;

	public Thread1(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		synchronized (lock1) {
			System.out.println("Thread-1 lock-1");
			synchronized (lock2) {
				System.out.println("Thread-1 lock-2");
			}
		}
	}
}

class Thread2 extends Thread {
	private final Object lock1;
	private final Object lock2;

	public Thread2(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		synchronized (lock2) {
			System.out.println("Thread-2 lock-2");
			synchronized (lock1) {
				System.out.println("Thread-2 lock-1");
			}
		}
	}
}
