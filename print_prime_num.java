import java.util.Scanner;

public class print_prime_num{
    static void printPrimeNumber(int low , int high){
	     while(low <= high){
boolean checker = true;

		for(int i = 2; i <=low; i++ ){
		    
		    if(low%2 == 0){
		        checker = false;
		        }
		}
		if(checker && low != 1 && low!= 0){
		System.out.println( low);
		} 
    low++;
    }
    
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Define the range to print prime number !");
        System.out.print("Enter the lowest number = ");

        int low = sc.nextInt();
        System.out.print("Enter the highest number = ");
        int high = sc.nextInt();

        printPrimeNumber(1, 78);

    }
}