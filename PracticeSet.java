import java.util.*;

public class PracticeSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// -> Q2
		/*
		 * try{
		 * System.out.print("Enter the input : ");
		 * int i = sc.nextInt();
		 * System.out.print("Enter the Num1 : ");
		 * int num1 = sc.nextInt();
		 * System.out.print("Enter the Num2 : ");
		 * int num2 = sc.nextInt();
		 * int div = num1/num2;
		 * System.out.println(div);
		 * }catch(ArithmeticException e){
		 * System.out.println("Ha Ha Ha Ha...");
		 * }catch(IllegalArgumentException e1){
		 * System.out.println("Ha Ha Ha Ha...");
		 * }
		 */
		int[] arr = { 10, 20, 30, 40, 50 };
		int indx = 0;
		while (true) {

			try {
				Thread.sleep(2000);
				System.out.println("The element at Index " + indx + " is : " + arr[indx]);
				indx++;
			} catch (Exception e) {
				System.out.println("ERROR");
				break;
			}
		}
	}

}