import java.util.Scanner;

public class Main {

    static void temperature(float n) {
        if (n == 0) {

            return;
        } else {
            float f = (c * 9 / 5) + 32;
        }
        System.out.println(f + "Faherenit");
    }

    // static int sumrec(int n){
    // if (n==1){
    // return 1;
    // }
    // return n + sumrec(n -1);
    // }
    //
    //
    // // static void pattern1(int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print("*"); // Use print instead of println
    // }
    // System.out.println(); // Print newline after each row
    // }
    // }

    // // Uncomment and use this method if needed
    // // static void multiplication(int a) {
    // // for (int i = 1; i <= 10; i++) {
    // // System.out.format("%d X %d = %d\n", a, i, a * i);
    // // }
    // // }

    public static void main(String[] args) {
        // Uncomment and use this method if needed
        // multiplication(5);
        // pattern1(100);
        // int c = sumrec(3);
        // System.out.print(c);
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();

    }
}
