import java.util.Scanner;

public class starPattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int row = 0; row < size; row++) {

            for (int col = 0; col <= size - row; col++)
                System.out.print(" ");

            for (int col1 = 0; col1 <= 2 * row; col1++)
                System.out.print("*");

            System.out.println();
        }

    }
}