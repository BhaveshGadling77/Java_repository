class myThread1 extends Thread {
	public void run() {
		int i = 0;
		int sum = 1;
		while (i < 40000) {
			// System.out.println("No. of times : "+sum);sum++;

			System.out.println("My cooking Thread1 is running...");
			System.out.println("I am happy!");
			i++;
		}
	}
}

class myThread2 extends Thread {

	public void run() {
		int j = 0;
		while (j < 40000) {
			System.out.println(" Thread 2 for chatting with her...");
			System.out.println("I am Sad!");
			j++;
		}
	}
}

public class Random_is {
	public static void main(String[] args) {

		myThread1 t1 = new myThread1();
		myThread2 t2 = new myThread2();
		t1.run();
		t2.run();
	}
}