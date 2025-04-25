import java.util.Scanner;

public class typeconversion {
    static int ASCII(int mychar) {
        return mychar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char mychar = 'A';
        int ASCIIval = (int) mychar;
        for (int i = (int) mychar; i <= (int) 'Z'; i++)
            System.out.print((char) i + " ");
        ASCII(mychar);

    }
}