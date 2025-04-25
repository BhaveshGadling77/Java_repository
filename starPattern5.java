import java.util.Scanner;

public class starPattern5 {
    public static void main(String[] args) {
        System.out.println("These the programmer to print Pyramid !");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pyramid = ");
        int size = sc.nextInt();
        for (int row = 0; row < size - 1; row++) {

            for (int col = 0; col < size; col++) {
                if (col + row == 6 || row == col)
                    System.out.print(" * ");

                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}