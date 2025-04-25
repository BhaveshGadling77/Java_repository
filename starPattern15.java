import java.util.*;

public class starPattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of triangle = ");
        int size = sc.nextInt();
        for (int row = 1; row < size; row++) {
            for (int sp = 1; sp < row; sp++)
                System.out.print(" ");

            for (int st = 1; st < 2 * (size - row); st++) {
                if ((st == 1 || st == 2 * (size - row) - 1) || row == 1)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}