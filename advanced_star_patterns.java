import java.util.*;

public class advanced_star_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size :  ");
        int size = sc.nextInt();
        // size *=2;
        // -> Question 1 Butterfly pattern
        // for(int row = 0; row <size; row++){
        // for(int st = 0; st <=row ; st++)
        // System.out.print("*");
        //
        // for(int sp = 0; sp<2*(size-row); sp++)
        // System.out.print(" ");
        //
        // for(int row1 = 0; row1<=row; row1++)
        // System.out.print("*");
        //
        // System.out.println();
        // }

        // for(int row = size; row >=0; row--){
        // for(int st = 0; st <=row ; st++)
        // System.out.print("*");
        //
        // for(int sp = 0; sp<2*(size-row); sp++)
        // System.out.print(" ");
        //
        // for(int row1 = 0; row1<=row; row1++)
        // System.out.print("*");
        //
        // System.out.println();
        // }

        // -> Question 2
        // Solid rhombus
        // for(int row = 0; row < size; row++){
        // for(int col = 0; col <size-row ; col++)
        // System.out.print(" ");

        // for(int st = 0; st<row; st++)
        // System.out.print("*");
        //
        // for(int st = 0; st<size -row; st++)
        // System.out.print("*");
        //
        // System.out.println();
        // }

        // -> Question 3
        // number pyramid
        // for(int row = 1; row<=size ; row++){
        // for(int col = 1; col <=size -row; col++)
        // System.out.print(" ");
        //
        // for(int col = 1; col<=row; col++)
        // System.out.print(row+" ");
        //
        // System.out.println();
        // }

        // -> Question 4
        // Palindromic pattern
        // int count =0;
        // for(int row = 1; row<=size ; row++){
        // count = row;
        // for(int sp = 1; sp<=size-row; sp++)
        // System.out.print(" ");

        // for(int num = 1; num<row;num++){
        // System.out.print(count);
        // count--;
        // }
        // for(int num = 1; num<=row;num++ ){
        // System.out.print(num);
        // }
        //
        // System.out.println();
        // }

        // -> Question 5
        // Diamond pattern
        for (int row = 0; row < size; row++) {
            for (int sp = 0; sp < size - row; sp++)
                System.out.print(" ");

            for (int st = 0; st <= 2 * row; st++)
                System.out.print("*");
            System.out.println();
        }
        for (int row1 = 0; row1 < size; row1++) {
            for (int sp = 0; sp <= row1; sp++)
                System.out.print(" ");

            for (int st = 1; st < 2 * (size - row1); st++)
                System.out.print("*");

            System.out.println();
        }

    }
}