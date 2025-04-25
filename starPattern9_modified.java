import java.util.Scanner;

public class starPattern9_modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of triangle = ");
        int size = sc.nextInt();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row <= col)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}