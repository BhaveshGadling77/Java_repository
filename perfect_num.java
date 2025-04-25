import java.util.Scanner;

public class perfect_num {
    static int perfectnumber(int per) {

        boolean checker = false;
        int sum = 0;
        for (int i = 1; i < per; i++) {
            if (per % i == 0) {
                sum += i;
            } else {
                
            }
        }
        if (sum == per) {
            System.out.println("The num is perfect number!");
        } else {
            System.out.println("The num is not perfect number! ");
        }
        return per;
    }

    public static void main(String[] args) {
        // 6 = 3 + 2+1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int per = sc.nextInt();
        perfectnumber(per);

    }
}