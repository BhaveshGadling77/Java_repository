import java.util.Scanner;

public class str_methods1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        if (id.endsWith("org")) {
            System.out.println("This is an organised website ..!!");

        } else if (id.endsWith("in")) {

            System.out.println("This is an indian website !!");

        } else if (id.endsWith("com")) {
            System.out.println("This is a commercial website !!");
        } else {
            System.out.println("Please enter the valid url !!");

        }

    }
}