import java.util.Scanner;

public class starPattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col < size - 1 - row)
                    System.out.print("  ");

                else
                    System.out.print(" " + row + " ");
            }

            // System.out.print(" ");
            //
            for (int col1 = 1; col1 <= row; col1++)
                System.out.print(" " + row + " ");
            //
            // for(int row1 =1; row1 <=row;row1++)
            // System.out.print(" * ");
            //
            System.out.println();
        }
    }
}