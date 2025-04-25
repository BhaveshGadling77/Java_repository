import java.util.Scanner;

public class starPattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Triangle = ");
        int size = sc.nextInt();
        char i = 'A';
        char j = 'D';
        char my = 'G';
        for (int row = (int) i; row < (int) my; row++) {
            for (int col = (int) i; col < (int) my - (int) i; col++)
                System.out.print((char) i);

            System.out.println();
        }

    }
}