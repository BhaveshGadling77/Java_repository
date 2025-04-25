import java.util.Scanner;

public class starPattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of triangle = ");
        int size = sc.nextInt();
        for (int row = 0; row < size; row++) {
            for (int sp = 0; sp <= row; sp++)
                System.out.print(" ");

            for (int st = 1; st < 2 * (size - row); st++)
                System.out.print("*");

            System.out.println();
        }

    }
}