import java.util.Scanner;

public class Armstrong_num {

    static long Method(long num) {
        long sum = 0;

        long temp = num;
        while (num > 0) {
            long digit = num % 10;
            num = num / 10;
            sum = sum + (digit * digit * digit);

        }
        System.out.println("The sum of cube this digit is = " + sum);
        if (sum == temp) {
            System.out.println("The number is Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number!");

        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        Method(num);

    }
}