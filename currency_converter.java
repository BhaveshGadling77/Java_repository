import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("These is program to convert INR into various type of currency");
        Scanner sc = new Scanner(System.in);
        System.out.println("INR --> Doller($)  = S");
        System.out.println(" INR --> Yen (¥) =J ");
        System.out.println("INR --> Chinese yaun(CN¥) = C ");
        System.out.println("for converting Rs to any currency write R and First letter of that currency");

        String s = sc.nextLine();
        switch (s) {

            case "S":
                System.out.print("Enter the value  = ");

                float a = sc.nextFloat();
                float mul = a / 83.44f;
                System.out.println("The " + a + "rs = " + mul + "Doller");
                break;
            case "J":
                System.out.print("Enter the value  = ");
                float b = sc.nextFloat();
                float div = b / 0.52f;
                System.out.println("The " + b + "rs = " + div + "Yen 💴 ");
                break;

            case "C":
                System.out.print("Enter the value  = ");
                float c = sc.nextFloat();
                float di = c / 11.48f;
                System.out.println("The " + c + "rs = " + di + "CN¥");
                break;
            case "RS":
                System.out.print("Enter the value = ");
                float d = sc.nextFloat();
                float rs = d * 83.44f;
                System.out.println("The " + d + "$ =" + rs + "rs");
                break;

            case "RJ":
                System.out.print("Enter the value = ");
                int e = sc.nextInt();
                float er = e * 0.52f;
                System.out.println("The " + e + "¥ = " + er + "rs");
                break;

            case "RC":
                System.out.print("Enter the value = ");
                float r = sc.nextFloat();
                float m = r * 11.48f;
                System.out.println("The " + r + "CN¥ = " + m + "rs");
                break;
            default:
                System.out.println("Invalid entry !");

        }
    }
}