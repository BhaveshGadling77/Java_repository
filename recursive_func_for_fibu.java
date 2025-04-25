public class recursive_func_for_fibu {
    public static void printFibu(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + ",");

        printFibu(b, c, n - 1);
    }

    public static void main(String[] args) {
        int n = 9;
        int a = 0, b = 1;
        System.out.print(a + ",");
        System.out.print(b + ",");

        printFibu(0, 1, n - 2);

    }
}