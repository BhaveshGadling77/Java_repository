import java.util.Scanner;

public class starPattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of diagonal : ");
        int size = sc.nextInt();
        // for(int row = 0; row<size ;row++){
        // for(int col =0; col<=row; col++){
        // if(col<row)
        // System.out.print(" ");
        // else
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        int count = 1;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            System.out.println(count);
            count++;
        }

    }
}