import java.util.Scanner;

public class calculating_percentages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  of the subjects = ");
        int size = sc.nextInt();
        int[] marks = new int[size];

        System.out.println("Enter the marks of the subjects ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Marks in subject " + (i + 1) + " = ");
            marks[i] = sc.nextInt();
            if (marks[i] <= 100) {

                sum = sum + marks[i];

            }

            else
                System.out.println("Please Enter the valid marks !");
            break;

        }
        System.out.println(sum);
        float div = size * 100.0f;
        float prct = (sum / div) * 100;
        System.out.println("the percentage of student is = " + prct);

    }
}