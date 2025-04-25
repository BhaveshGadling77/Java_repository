import java.util.Arrays;

public class Arrays_2d_challenge1 {
    public static void main(String[] args) {
        int[] myArray = { 10, 20, 30, 40, 50, 60 };
        System.out.print("Before reverse :  ");
        for (int val : myArray) {
            System.out.print(" " + val);
        }

        // System.out.println();
        // System.out.print(" After reverse : ");
        // for(int indx = myArray.length-1; indx>=0; indx--)
        // System.out.print( " "+myArray [indx]);
        int first = 0;
        int last = myArray.length - 1;
        while (last > first) {
            int temp = myArray[first];
            myArray[first] = myArray[last];
            myArray[last] = temp;
            first++;
            last--;
        }

        System.out.println();
        System.out.print("After reverse :  ");
        for (int val : myArray) {
            System.out.print(" " + val);
        }

    }
}