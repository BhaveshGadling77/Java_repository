public class starpattern1 {
    public static void main(String[] args) {

        for (int row = 1; row < 5; row++) {
            for (int star = 1; star < 5; star++) {

                if (row == 1 || row == 4 || star == 1 || star == 4) {

                    System.out.print(star + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}