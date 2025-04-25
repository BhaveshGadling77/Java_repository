import java.util.Scanner;

public class fibu {
    static long Star(long num1) {

        long sum = 0;
        long num2 = 1;
        long next;
        System.out.print(num1 + "," + num2);

        for (long i = 0; i < 10; i++) {
            next = num1 + num2;
            num1 = num2;
            num2 = next;

            System.out.print("," + next);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Star(0);
    }
}