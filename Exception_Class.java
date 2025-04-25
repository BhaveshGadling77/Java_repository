
import java.util.*;

class NegativeRadiusException extends Exception {
	public String toString() {
		return "I am toString()";
	}

	public String getMessage() {
		return " I am getMessage()";
	}

}

public class Exception_Class {
	public static double area(int r) throws NegativeRadiusException {
		if (r < 0) {
			throw new NegativeRadiusException();
		}
		double result = Math.PI * r * r;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * //
		 */
		// int a = sc.nextInt();

		// if(a<99){
		try {
			// throw new NegativeRadiusException();
			double ar = area(6);
			System.out.println(ar);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println("Finished");

		}
		System.out.println("Yes finished");

		// */

	}

}