
class MyThr1 extends Thread {

	public void run() {
		int i = 0;
		while (true) {
			System.out.println("Thank you1");
			i++;
		}
	}
}

class MyThr2 extends Thread {

	public void run() {
		int j = 0;
		while (true) {
			System.out.println("Thank you1");
			j++;
		}
	}
}

public class newClass {

	public static void main(String[] args) {
		MyThr1 t1 = new MyThr1();
		MyThr2 t2 = new MyThr2();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
	}
}