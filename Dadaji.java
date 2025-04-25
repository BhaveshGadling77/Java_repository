class Dadaji1 {
	String name = "Bhagvantrao";
	String surname = "Gadling";

}

class Father extends Dadaji1 {
	String name = "Anil";

}

class Me extends Father {
	String name = "Bhavesh";
	int prop = 500000;
}

class Mother {
	String name = "MOM";
	String surname = "Kadshe";
	int prop = 20000;
}

class Features {
	static void add(int a, int b) {
		System.out.println(a + b);
	}

	static void add(double a, double b) {
		System.out.println(a + b);
	}
}

public class Dadaji {
	public static void main(String[] args) {
		/*
		 * Me obj = new Me();
		 * System.out.println(obj.name);
		 * System.out.println(obj.surname);
		 */
		Features.add(3, 4);
		Features.add(3.4, 6.6);
	}
}