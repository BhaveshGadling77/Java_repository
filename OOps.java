
class Employee {
	private int ph = 0;
	int empId = 2;
	static int basicsal = 20000;
	static int incentive = 200;

	static void countSal() {
		System.out.println(basicsal + incentive);
	}

	int getph() {
		return ph;
	}
}

public class OOps {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println(".");
			}
		}

		Employee obj = new Employee();
		obj.countSal();
		System.out.println(obj.getph());
	}
}