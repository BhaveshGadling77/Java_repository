import java.util.*;

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array 1 = ");
        int size = sc.nextInt();
        int[] mat1 = new int[size];
        System.out.print("Enter the size of Array 2 = ");
        int size1 = sc.nextInt();
        int[] mat2 = new int[size1];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the elements of array 1 at index " + (i + 1) + " = ");
            mat1[i] = sc.nextInt();
        }
        for (int j = 0; j < size; j++) {
            System.out.print("Enter the elements of array 2 at index " + (j + 1) + " = ");
            mat2[j] = sc.nextInt();
        }
        for (int E1 = 0; E1 < size; E1++) {
            for (int E2 = 0; E2 < size; E2++) {
                if (mat1[E1] == mat2[E2])
                    System.out.println("The comman element is = " + mat1[E1]);
            }
        }

    }
}