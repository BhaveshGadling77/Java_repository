
import java.util.*;

public class ShoppingCart {
  static Scanner sc = new Scanner(System.in);
  // ShoppingCart obj = new ShoppingCart();
  static int gram = 0;
  static float pay = 0;

  static void add() {
    try {
      System.out.println("What do you want to add in your shopping cart...");
      // sc.nextLine();
      String fruit = sc.nextLine();
      fruit = fruit.trim().toLowerCase();
      int price = 0;
      switch (fruit) {
        case "apple": {
          System.out.println("How many grams you want ?");
          gram = sc.nextInt();
          price = 60;
          bill(gram, price);
          commands();
          break;
        }

        case "banana": {
          System.out.println("How many grams you want ?");
          gram = sc.nextInt();
          price = 70;
          bill(gram, price);
        }
          break;

        case "oranges": {
          System.out.println("How many grams you want ?");
          gram = sc.nextInt();
          price = 80;
          bill(gram, price);
        }
          break;
        case "kiwi": {
          System.out.println("How many grams you want ?");
          gram = sc.nextInt();
          price = 100;
          bill(gram, price);
        }
          break;

        case "grapes": {
          System.out.println("How many grams you want ?");
          gram = sc.nextInt();
          price = 60;
          bill(gram, price);
        }
          break;

        case "chiku": {
          System.out.println("How many grams you want ?");
          gram = sc.nextInt();
          price = 70;
          bill(gram, price);
        }
          break;

        case "mosambi": {
          System.out.println("How many grams you want ?");
          gram = sc.nextInt();
          price = 65;
          bill(gram, price);
        }
          break;

        case "dragonfruit": {
          System.out.println("How many grams you want ?");
          gram = sc.nextInt();
          price = 300;
          bill(gram, price);
        }
          break;

        default: {
          System.out.println("The item is not in the shop.");
          commands();
        }
          break;

      }
    } catch (Exception e) {
      System.out.println("please enter the valid input :(...");
    }
  }

  static void bill(int gram, int price) {
    float tprice = (gram * price) / 1000.0f;
    pay = pay + tprice;
    System.out.println(pay);

  }

  public static void main(String[] args) {
    HashMap<String, Integer> list = new HashMap<String, Integer>();

    System.out.print("List of food items available in shop : ");
    list.put("Apple ", 60);
    list.put("Banana ", 70);
    list.put("Oranges ", 80);
    list.put("kiwi ", 100);
    list.put("Grapes ", 60);
    list.put("Chiku ", 70);
    list.put("Mosambi ", 65);
    list.put("Dragon fruit ", 300);
    System.out.println(list + "(per Kg)");
    System.out.println("What you want to do...?(add, return, pay, list)");
    commands();
  }

  static void commands() {
    try {
      String com = sc.nextLine();
      com = com.trim().toLowerCase();
      boolean check = true;
      while (check) {
        switch (com) {
          case "add":
            add();
            break;

          case "list":
            main(null);
            break;
          default:
            System.out.println("Invalid command.");
            commands();
            break;
        }
      }
    } catch (Exception e) {
      // System.out.println(e.getMessage());
      // sc.nextLine();
      commands();
    }
  }
}
