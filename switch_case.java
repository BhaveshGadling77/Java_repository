import java.util.Scanner;

public class switch_case {

    static double sum(double a1, double a2) {

        return a1 + a2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose what to do");
        System.out.println("ln = Log ");
        System.out.println("log10 = log 10");
        System.out.println("c = cube root ");
        System.out.println(" s = square root");
        System.out.println("A = adding two numbers");

        String a = sc.next();
        System.out.print(" Enter the number = ");

        switch (a) {
            case "ln":
                int b = sc.nextInt();
                System.out.println("The natural log of " + b + "is" + Math.log(b));
                break;

            case " log10":
                int r = sc.nextInt();
                System.out.println("The Log 10 " + r + " is " + Math.log10(r));
                break;
            case "c":
                int c = sc.nextInt();
                System.out.println("The cube root of " + c + " is " + Math.cbrt(c));
                break;
            case "s":
                int d = sc.nextInt();
                System.out.println("The square root of " + d + " is " + Math.sqrt(d));
                break;
            case "A":
                double a1 = sc.nextDouble();
                double a2 = sc.nextDouble();
                System.out.println("The sum this number" + sum(a1, a2));

            default:
                System.out.println("Invalid choice");
                break;

        }
    }
}