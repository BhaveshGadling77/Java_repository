
class quotes extends Thread {
	public void run() {
		while (true) {
			System.out.println("Good Morning!!");
		}
	}
}

class quotes1 extends Thread {
	public void run() {
		while (true) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Welcome!");
		}
	}
}

public class Practice {

	public static void main(String[] args) {
		quotes p1 = new quotes();
		quotes1 p2 = new quotes1();
		// p1.setPriority(6);
		// p2.setPriority(9);
		// p1.start();
		// p2.start();
		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		System.out.println(p1.getState());
		System.out.println(p2.getState());

		System.out.println(Thread.currentThread().getState());

	}

}