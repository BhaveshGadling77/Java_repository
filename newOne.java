import java.util.*;

public class newOne {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String fruit = sc.next();
    switch (fruit) {
      case "apple":
        System.out.println("A sweet red fruit");
        break;
      case "banana":
        System.out.println("kela hai Akela.....");
        break;

      case "Orange":
        System.out.println("Oranges.....");
        break;
      default:
        System.out.println("Please enter the valid input.....");
    }

  }
}