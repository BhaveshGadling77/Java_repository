
public class String_methods {

	static int myMethod() {
		System.out.println("Hi I am return type Method !");

		return 0;

	}

	static String myFriend(String loc) {
		System.out.println("Hi I am return type Method !");

		return "Boom";

	}

	public static void main(String[] args) {
		int rvalue = myMethod();
		System.out.println("Return value = " + rvalue);
		System.out.println(myFriend("XYZ"));
	}
}
