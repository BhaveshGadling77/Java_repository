import java.util.Scanner;

public class Basic_Operations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 = ");
        float a = sc.nextFloat();
        System.out.print("Enter number 2 = ");
        ;
        float b = sc.nextFloat();
        System.out.println("Before swapping the numbers num 1 = " + a + " & num 2 = " + b);

        // int temp = 0;
        // a = temp;
        // a = b;
        // b = temp;

        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swapping the numbers num 1 = " + a + " & num 2 = " + b);

    }
}