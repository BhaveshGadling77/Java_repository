import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2d_more_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Students = ");
        int students = sc.nextInt();
        System.out.print("Enter the no. of Subjects = ");
        int subject = sc.nextInt();

        int[][] result = new int[students][subject];
        boolean checker = false;
        for (int row = 0; row < students; row++) {

            for (int col = 0; col < subject; col++) {
                System.out.print("Enter the marks of student " + (row + 1) + " in subject " + (col + 1) + "= ");

                result[row][col] = sc.next().charAt(0);
                // if( result [row][col] >100){
                // checker = true;
                // break; }
                System.out.println();
            }

            if (checker == true) {
                System.out.println("Please enter the valid marks..!!");
                break;
            }

        }
        System.out.println(Arrays.deepToString((result)));

        int[] my = { 10, 20, 30, 40, 50 };
        for (int indx = 0; indx < my.length; indx++) {
            if (indx == my.length - 1) {
                int temp = my[0];
                my[0] = my[indx];
                my[indx] = temp;
            }
            // System.out.print(my [indx]+ " ");

        }
        for (int val : my) {
            System.out.print(val + ",");
        }

    }
}