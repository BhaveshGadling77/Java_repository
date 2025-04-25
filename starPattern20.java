import java.util.*;

public class starPattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Triangle : ");
        int size = sc.nextInt();
        for (int row = 0; row < size; row++) {
            for (int sp = 0; sp < size - row; sp++)
                System.out.print(" ");

            for (int st = 1; st < 2 * row; st++)
                System.out.print("*");
            System.out.println();
        }
        for (int row = 0; row < size; row++) {
            for (int sp = 0; sp < row; sp++)
                System.out.print(" ");

            for (int st = 0; st < (size - row); st++) {
                if (st > row)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            for (int st1 = 0; st1 < size - row; st1++) {
                if (st1 < row + 1)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            ;

            System.out.println();
        }

    }
}