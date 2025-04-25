import java.util.Scanner;
import java.util.Arrays;

public class duplicate_num {
    public static void main(String[] args) {
        int[] array = { 3, 3, 4, 6, 5, 4, 4 };
        boolean checker = false;

        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1])
                System.out.println("The duplicate num = " + array[i]);

        }

    }
}