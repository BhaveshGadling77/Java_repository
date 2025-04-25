import java.util.Scanner;

public class starPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Triangle = ");
        int size = sc.nextInt();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col <= row; col++)
                System.out.print(" * ");

            for (int col1 = 0; col1 < size - row; col1++)
                System.out.print(" * ");
            System.out.println();
        }

        System.out.println();

        // for (int row1= 1 ; row1< size; row1++){
        //
        // for(int col1 = 0; col1 < size -row1; col1++)
        // System.out.print(" * ");
        //
        // System.out.println();
        // }
    }
}