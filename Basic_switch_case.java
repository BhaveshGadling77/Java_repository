import java.util.Scanner;

public class Basic_switch_case {

    static String letter(String y) {
        switch (y) {

            case "a":
            case "u":
            case "e":
            case "i":
            case "o":
                System.out.println("the letter entered is vowel");
                break;
            default:
                System.out.println("the letter entered is consonant");
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String y = sc.nextLine();

        letter(y);

    }
}