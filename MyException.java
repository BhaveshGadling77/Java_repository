
import java.util.*;

class MyException1 extends Exception {
	public String toString() {
		return "You Can't divide the number by 0 it is not defined !!";
	}
}

public class MyException {
	static int num1;
	static int num2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean checker = true;
		while (checker) {
			System.out.println("*,/,-,+");
			System.out.println("For division num1 is divided by num2");

			System.out.print("Enter what you want to do : ");
			String store = sc.next();
			try {
				System.out.println("Enter num1 : ");
				num1 = sc.nextInt();
				System.out.println("Enter num1 : ");
				num2 = sc.nextInt();
			} catch (Exception a) {
				System.out.println("Enter the valid input...");

			}
			switch (store) {

				case "*":
					if (num1 >= 70000 || num2 >= 70000) {
						throw new ArithmeticException("You can't give the input greater than 70k !!");
					} else
						System.out.println("The multiplication of two numbers is : " + num1 * num2);
					break;
				case "/":
					try {
						System.out.println("The division of these two numbers : " + num1 / num2);
					} catch (Exception e) {
						String str = e.toString();
						System.out.println(str);
					}
					break;
				case "+":
					if (num1 >= 100000 || num2 >= 100000)
						throw new ArithmeticException("You can't give the input greater than 100k !!");
					else
						System.out.println("The sum of these numbers is : " + (num1 + num2));
					break;

				case "-":
					if (num1 >= 100000 || num2 >= 100000)
						throw new ArithmeticException("You can't give the input greater than 100k !!");
					else
						System.out.println("The subraction of these numbers is : " + (num1 - num2));
					break;

				case "exit":
					checker = false;
					break;

				default:
					System.out.println("Enter the valid input !!");
			}
		}
	}
}