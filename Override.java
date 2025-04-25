;
class phone {

	public void showTime() {
		System.out.println("Time is 8am...");
	}
}

class NewPhone extends phone {

	public void showTime() {
		System.out.println("Time is 8pm");
	}

}

public class Override {

	public static void main(String[] args) {
		NewPhone obj = new NewPhone();
		obj.showTime();
	}
	/*
	 * Create a library management Which is capable of issuing books to the
	 * Students.
	 * book should have info like
	 * 1. book name
	 * 2. book Author
	 * 3. Issued to
	 * 4. Issued on
	 * User should be able to add books, return books, issue books.
	 * Assume that all the users are registered with their names in the control
	 * database.
	 * 
	 */

}