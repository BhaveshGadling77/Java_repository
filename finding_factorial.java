import java.util.Scanner;

public class finding_factorial {

    static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        System.out.println("The value of the factorial is: " + factorial(a));
    }
}
