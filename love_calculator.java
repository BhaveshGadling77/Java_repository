import java.util.Scanner;

public class love_calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String a = sc.next();
        System.out.print("Enter Your partners name = ");
        String b = sc.next();
        int perct = (int) (Math.random() * 100);
        System.out.println(" Your lover " + b + " " + perct + "% " + "loves to you " + a);

    }
}