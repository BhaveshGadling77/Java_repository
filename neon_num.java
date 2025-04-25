import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        int rem = 0;
        int digit = 0;
        sum = sum + num * num;
        System.out.println(sum);
        while (sum > 0) {
            sum = sum % 10;

            System.out.println(sum % 10);
            sum = sum / 10;
        }
        if (temp == sum) {
            System.out.println("the no. is Neon number ");
        } else {
            System.out.println("the no. is not neon number ");
        }

    }
}