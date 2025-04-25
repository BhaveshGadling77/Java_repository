public class array_sorting {

    public static void main(String[] args) {
        int[] arr = { 1, 21, 35, 67, 6454 };
        boolean isSourted = false;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                System.out.println("Yes ! the array is sorted ! ");
            }

            else {
                System.out.print("No ! The array is not sorted");

            }
        }
    }

}
