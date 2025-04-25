public class ASCII {
    public static void main(String[] args) {
        char i = 'D';
        char j = 'A';
        char mychar = 'E';
        for (int row = (int) j; row <= (int) i; row++) {

            for (int col = (int) j; col <= (int) mychar; col++)
                System.out.print((char) col + " ");

            System.out.println();
        }
    }
}
