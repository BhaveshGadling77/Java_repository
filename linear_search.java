import java.util.Scanner;

public class linear_search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Define your size of array = ");
        int size = sc.nextInt();
        int[] marks = new int[size];
        boolean found = false;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.print("Enter the; number to search: ");
        int x = sc.nextInt();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == x) {
                System.out.println("The number " + x + " is found at index: " + i);
                found = true;
                break; // Exit loop after finding the first occurrence
            }
        }

        if (!found) {
            System.out.println("The number " + x + " is not found in the array.");
        }
    }
}
