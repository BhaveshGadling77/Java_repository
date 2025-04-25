import java.util.Scanner;

public class strMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        int sum = 0;

        System.out.print((int) c);

        sum = sum + (int) c + (int) b + (int) a;
        System.out.println(sum);
    }
}