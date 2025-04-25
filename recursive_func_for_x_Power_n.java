import java.util.*;

public class recursive_func_for_x_Power_n {
    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0)
            return calPower(x, n / 2) * calPower(x, n / 2);

        else
            return calPower(x, n / 2) * calPower(x, n / 2) * x;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int mul = 0;
        calPower(x, n);
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}