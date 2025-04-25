
class MyThread1 implements Runnable {
	public void run() {
		int j = 0;
		System.out.println("I am a Thread 1 not a threat...");

		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");
		System.out.println("I am a Thread 1 not a threat...");

	}
}

class MyThread2 implements Runnable {
	public void run() {
		int i = 0;
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");
		System.out.println("I am a thread2 not a threat...");

	}
}

public class New {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		Thread gun1 = new Thread(t1);
		MyThread2 t2 = new MyThread2();
		Thread gun2 = new Thread(t1);
		gun2.run();
		gun1.run();
	}
}