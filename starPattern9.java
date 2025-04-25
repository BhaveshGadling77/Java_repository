import java.util.Scanner;

public class starPattern9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("   ");
            }
            // System.out.print(" ");
            for (int row1 = 1; row1 <= size - row; row1++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}