import java.util.Scanner;

public class Errors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 2, 3, 4, 3, 5 };
		boolean checker = true;
		while (checker) {
			System.out.println("Enter the number : ");
			int indx = sc.nextInt();
			try {
				System.out.println("The element at index " + indx + " is : " + arr[indx]);
				checker = false;
			} catch (Exception e) {
				System.out.println("please enter the valid index.");
			}
		}
	}
}