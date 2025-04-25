import java.util.Scanner;

public class sum_of_digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int square = num * num;
        while (square > 0) {
            sum = square % 10;
            System.out.println(sum);
            square = square / 10;

        }

    }
}