import java.util.*;

public class starPattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Triangle = ");
        int size = sc.nextInt();
        for (int row = size; row > 0; row--) {
            for (int sp = size; sp > size - row; sp--)
                System.out.print(" ");

            for (int st = size; st < 2 * row; st--) {
                if (st == 1 || st == 2 * row - 1)
                    System.out.print("*");

                else
                    System.out.print(" ");

            }
            // for(int st1 = 1; st1<size+row ; st1++)
            // System.out.print("*");

            System.out.println();
        }
    }
}