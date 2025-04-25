public class factorial {

    static void printFactorial(long num) {

        long fact = 1;
        for (long i = num; i >= 1; i--) {
            fact *= i;

        }
        System.out.println(num + "! = " + fact);
    }

    public static void main(String[] args) {

        printFactorial(27);
    }
}