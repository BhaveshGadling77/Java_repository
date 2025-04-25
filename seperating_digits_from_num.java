
import java.util.Scanner;
public class seperating_digits_from_num {

    static long Digits(long num) {

        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("These is a program to to print digits from number! ");
        System.out.print("Enter the number = ");
        long num = sc.nextLong();

        Digits(num);

    }
}
