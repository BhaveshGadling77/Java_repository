
import java.util.*;

public class Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * for(int i = 1; i<= 5; i++){
		 * try{
		 * Thread.sleep(1000);
		 * System.out.println(i);
		 * 
		 * if(i == 5){
		 * 
		 * break;
		 * }
		 * }catch(Exception e){
		 * System.out.println("Exception");
		 * }finally{
		 * System.out.println("[Program Finished]");
		 * }
		 * }
		 */
		int arr[] = { 19, 21, 33, 40, 56, 32 };
		int dix;
		System.out.println("Individual Division of number ");
		for (int i = 0; i < arr.length; i++) {
			try {
				System.out.println("Enter the index to divide with : ");
				i = sc.nextInt();
				System.out.println("Enter the number to divide with : ");
				int div = sc.nextInt();
				System.out.println("The division of " + arr[i] + "/" + div + "is :" + arr[i] / div);
				if (i == arr.length - 1) {
					break;
				}
			} catch (Exception e) {
				System.out.println("Please don't try to divide with 0!");
				System.exit(1);
			} finally {
				System.out.println("Thanks for Using!");
			}
		}
	}

}