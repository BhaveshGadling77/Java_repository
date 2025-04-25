import java.util.Scanner;

public class str_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                if (col > row)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            for (int row1 = 0; row1 < row + 1; row1++)
                System.out.print("*");
            // ;for(int row1 = 0;)
            System.out.println();
        }

    }
}