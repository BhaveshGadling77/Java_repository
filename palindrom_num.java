import java.util.Scanner;

public class palindrome_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int pndr = sc.nextInt();
        sc.close();
        checkPalindrome(pndr);
    }

    public static void checkPalindrome(int pndr) {
        int temp = pndr;
        int rev = 0;

        while (pndr > 0) {
            int rem = pndr % 10;
            rev = rev * 10 + rem;
            pndr = pndr / 10;
        }

        if (rev == temp) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}