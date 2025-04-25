import java.util.*;

public class Interest_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount  = ");
        float amt = sc.nextFloat();
        System.out.print("Enter the time in days = ");
        float time = sc.nextFloat();
        float sky = time;
        System.out.print("Enter the rate = ");
        float rate = sc.nextFloat();

        float pwx = (1 + rate / 100);
        for (int i = 0; i < pwx; i++) {
            sky *= pwx;
        }
        System.out.print("The compound interest is : " + sky * amt / 2);
    }
}
