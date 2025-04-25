import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int array[] = { 3, 4, 5, 6, 4 };
        // System.out.println(array [a]);

        try {
            System.out.println(array[a]);
        } catch (Exception e) {
            System.out.println("Bhai Aukaat Me Reh tu.....!!");
        }

    }
}