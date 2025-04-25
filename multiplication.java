import java.util.Scanner;

public class multiplication {

    static void multiplication(int a) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.format("%d X %d = %d\n", a, i, a * i);
        }
    }

    public static void main(String[] args) {
        multiplication(535646475);
    }
}
