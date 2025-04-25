import java.util.Scanner;

public class starPattern2 {
    public static void main(String[] args) {

        System.out.print("Enter the size = ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ;
        int mul = 0;
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                if (col == row || col + row == size)
                    System.out.print("#");

                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}