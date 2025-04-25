import java.util.Arrays;

public class array_methods {
    public static void main(String[] args) {

        // int [] myArray = {10,40,70,90};
        // for (int i = 0; i < myArray.length; i++)
        // System.out.print(myArray[i] + ",");

        // for (int value : myArray)
        // System.out.println(value);
        int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int i = 0;
        // System.out.println(Arrays.toString(myArray));
        while (i < myArray.length) {
            if (i < myArray.length) {
                System.out.println(myArray[i]);
            }

            else
                break;
            i++;

        }
    }
}