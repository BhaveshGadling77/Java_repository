import java.util.Arrays;

public class Array_2d_methods {
    public static void main(String[] args) {
        int a1[] = { 40, 50, 60, 70 };
        int a2[] = { 30, 50, 60, 80 };

        int papaArray[][] = {
                { 45, 65, 77, 98 },
                { 40, 50, 60, 70 },
                { 30, 50, 69, 80 },
                { 45, 66, 778, 87 }
        };
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                // System.out.print(papaArray[row][col] + ",");
                String str = Arrays.toString(papaArray[row][col]);
                System.out.println(str);
            }
            // System.out.println();
        }
        // for(int childArray[] : papaArray){
        // for(int value : childArray)
        // System.out.print(value +",");
        // System.out.println();
        //
        //
        // }

        // System.out.println(Arrays.toString(papaArray));

    }
}