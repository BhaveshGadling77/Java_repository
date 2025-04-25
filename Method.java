import java.util.Scanner;

public class Method {

    static double sum(double a, double b) {
        return a + b;
    }

    static double sum1(double a, double b , double c){
           return a+b+c;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("sum = " + sum1(a, b, c));

    }
}