import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] my2Darray = { { 1, 2 }, { 2, 4 }, { 4, 8 } };

        try {
            System.out.println("Array =" + my2Darray[a][b]);

        } catch (Exception e) {
            System.out.println("Bhai aukaat me reh...!!");
        }
    }
}