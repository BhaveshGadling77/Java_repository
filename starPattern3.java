import java.util.Scanner;

public class starPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size = ");
        int size = sc.nextInt();
        char my = (char) size;
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= row; col++)
                System.out.print("* ");

            System.out.println();
        }

    }
}