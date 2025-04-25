import java.util.Scanner;

public class starPattern17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size = ");
        int size = sc.nextInt();
        for (int row = 0; row < size; row++) {
            for (int sp = 0; sp < size - row; sp++)
                System.out.print(" ");

            for (int st = 0; st <= 2 * row; st++)
                System.out.print("*");
            System.out.println();
        }
        for (int row1 = 0; row1 < size; row1++) {
            for (int sp = 0; sp <= row1; sp++)
                System.out.print(" ");

            for (int st = 1; st < 2 * (size - row1); st++)
                System.out.print("*");

            System.out.println();
        }

    }
}