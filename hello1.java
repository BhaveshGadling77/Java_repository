class phone {

	public void showTime() {
		System.out.println("Time is 8am...");
	}
}

class NewPhone extends phone {

	public void showTime() {
		System.out.println("Time is 8pm");
	}

	@Deprecated
	public int sum(int a, int b) {
		return a + b;
	}

}

public class hello1 {

	public static void main(String[] args) {
		NewPhone obj = new NewPhone();
		obj.showTime();
		System.out.println(obj.sum(5, 6));
	}

}