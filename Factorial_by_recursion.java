import java.util.Scanner;

public class Factorial_by_recursion {
    static long boss(long num) {

        long fact = 1;

        for (long i = num; i >= 1; i--) {

            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        long num = sc.nextLong();
        long fact = boss(num);
        System.out.println(num + "! = " + fact);

    }
}