import java.util.Scanner;

public class addition_of_matrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat1 = new int[2][3];

        int[][] mat2 = new int[2][3];
        for (int i = 1; i < 3; i++) {
            System.out.printf("Enter the elements (row wise) of the matrix %d", i);

            System.out.println("");
            for (int j = 0; j < mat1.length; j++) {
                for (int k = 0; k < mat1[j].length; k++) {

                    if (i == 1) {
                        mat1[j][k] = sc.nextInt();
                    } else {
                        mat2[j][k] = sc.nextInt();
                    }
                }
            }
        }
        for (int i = 1; i < 3; i++) {
            System.out.printf("Entered matrix %d is : \n", i);
            
            for (int j = 0; j < mat1.length; j++) {
                for (int k = 0; k < mat1[j].length; k++) {
                    if (i == 1) {
                        System.out.print(mat1[j][k]);
                        System.out.print(" ");
                    } else {
                        System.out.print(mat2[j][k]);
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        int[][] result = new int[2][3];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("The sum of two matrix is :- ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        int[] g = { 4, 56, 89, 0 };
        int a = Math.floorDiv(g.length, 2);
        System.out.println(a);

    }
}
