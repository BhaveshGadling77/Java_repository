public class Recursion {
    public static void printNat(int n, int n1, int sum) {

        if (n == n1) {
            sum = sum + n;
            System.out.println("Sum : " + sum);
            return;
        }
        sum = sum + n;
        printNat(n + 1, n1, sum);
    }

    public static void main(String[] args) {
        printNat(1, 6, 0);
    }
}