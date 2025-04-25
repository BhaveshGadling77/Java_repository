class MyThr extends Thread {
	public MyThr(String name) {
		super(name);
	}

	public void run() {
		int i = 0;
		while (i < 2) {
			System.out.println("I am a Thread.");
			i++;
		}
	}
}

public class Thread_class {

	public static void main(String[] args) {
		MyThr t1 = new MyThr("Harry");
		t1.start();
		MyThr t2 = new MyThr("Bhavesh");

		System.out.println("The Id of the Thread t is " + t1.getId());
		System.out.println("The Name of the Thread t is " + t1.getName());
		System.out.println("The Id of the Thread t is " + t2.getId());
		System.out.println("The Name of the Thread t is " + t2.getName());
	}

}
