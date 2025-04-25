import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean checker = false;

        int num = sc.nextInt();

        if (num == 2) {

            System.out.println("The number is Prime");
        } else {

            for (int i = 2; i < Math.sqrt(num); i++) {

                if (num % i != 0) {
                    System.out.println("The number is prime!");
                    break;

                }

                else {
                    System.out.println("The number is not prime!");
                    break;
                }

            }
        }

    }
}