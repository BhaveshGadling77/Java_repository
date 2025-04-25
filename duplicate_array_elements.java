import java.util.Arrays;

public class duplicate_array_elements {
    public static void main(String[] args) {
        int[] Array = { 1, 2, 3, 4, 2, 7, 8, 8, 8, 3, 9 };
        boolean checker = false;
        System.out.println("Duplicate element in given Arrray : ");
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] == Array[j])
                    System.out.println(Array[i]);

            }

        }

    }
}