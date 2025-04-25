import java.util.Scanner;

public class starPattern7_modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Triangle = ");

        int size = sc.nextInt();
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                if (col <= size - row - 1)
                    System.out.print(" # ");

                else
                    System.out.print(" * ");

            }
            System.out.println();
        }
    }
}