public class arrays {

    public static void main(String[] args) {

        // int[] marks = {97, 89, 91, 45, 78};

        // for (int i = marks.length -1 ; i >= 0 ; i--) {
        // System.out.println(marks[i]);
        //
        // }
        // System.out.println("Printing Using for each loop ");
        // for (int element : marks ){
        // System.out.println(element);
        // }
        //
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("Printing the 2 - D array");
        for (int i = 0; i < flats.length; i++) {

            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print("  ");
            }

            System.out.println("  ");
        }

    }
}
