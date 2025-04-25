import java.util.Scanner;

public class starPattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size = ");
        int size = sc.nextInt();

        for (int row = 0; row <= size; row++) {
            for (int col = 1; col < size + 1; col++) {
                if (col > row)
                    System.out.print("*");

                else
                    System.out.print(" ");

            }
            for (int row1 = 1; row1 < 2 * (size - row); row1++)
                System.out.print("*");

            System.out.println();

        }

    }
}