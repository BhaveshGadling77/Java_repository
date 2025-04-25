import java.util.Scanner;

public class reversing_num {
    static int Method(int num) {
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.print(rev + ".");

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        System.out.print("The number " + num);
        System.out.print(" The reverse number is ");

        Method(num);

    }
}
