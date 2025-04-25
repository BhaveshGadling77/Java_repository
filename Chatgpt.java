
import java.util.HashMap;
import java.util.Scanner;

public class Chatgpt {
    static Scanner sc = new Scanner(System.in);
    static int gram = 0;
    static float pay = 0;

    static void add() {
        try {
            System.out.println("What do you want to add in your shopping cart...");
            String fruit = sc.nextLine();
            fruit = fruit.trim().toLowerCase();
            int price = 0;

            switch (fruit) {
                case "apple": {
                    System.out.println("How many grams do you want?");
                    gram = sc.nextInt();
                    price = 60;
                    bill(gram, price);
                    commands();
                    break;
                }
                case "banana": {
                    System.out.println("How many grams do you want?");
                    gram = sc.nextInt();
                    price = 70;
                    bill(gram, price);
                    commands();
                    break;
                }
                case "oranges": {
                    System.out.println("How many grams do you want?");
                    gram = sc.nextInt();
                    price = 80;
                    bill(gram, price);
                    commands();
                    break;
                }
                case "kiwi": {
                    System.out.println("How many grams do you want?");
                    gram = sc.nextInt();
                    price = 100;
                    bill(gram, price);
                    commands();
                    break;
                }
                case "grapes": {
                    System.out.println("How many grams do you want?");
                    gram = sc.nextInt();
                    price = 60;
                    bill(gram, price);
                    commands();
                    break;
                }
                case "chiku": {
                    System.out.println("How many grams do you want?");
                    gram = sc.nextInt();
                    price = 70;
                    bill(gram, price);
                    commands();
                    break;
                }
                case "mosambi": {
                    System.out.println("How many grams do you want?");
                    gram = sc.nextInt();
                    price = 65;
                    bill(gram, price);
                    commands();
                    break;
                }
                case "dragonfruit": {
                    System.out.println("How many grams do you want?");
                    gram = sc.nextInt();
                    price = 300;
                    bill(gram, price);
                    commands();
                    break;
                }
                default: {
                    System.out.println("The item is not in the shop.");
                    commands();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine(); // Clear the scanner buffer
            commands();
        }
    }

    static void bill(int gram, int price) {
        float tprice = (gram * price) / 1000f; // Use 1000f to ensure float division
        pay = pay + tprice;
        System.out.println("Current total: " + pay);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        list.put("apple", 60);
        list.put("banana", 70);
        list.put("oranges", 80);
        list.put("kiwi", 100);
        list.put("grapes", 60);
        list.put("chiku", 70);
        list.put("mosambi", 65);
        list.put("dragonfruit", 300);

        System.out.print("List of food items available in the shop: ");
        System.out.println(list + " (price per Kg)");

        System.out.println("What do you want to do? (add, return, pay, list)");
        commands();
    }

    static void commands() {
        try {
            String com = sc.nextLine().trim().toLowerCase();

            switch (com) {
                case "add":
                    add();
                    break;
                case "pay":
                    System.out.println("Your total payment is: " + pay);
                    System.out.println("Thank you for shopping!");
                    break;
                case "list":
                    main(null); // To display the list again
                    break;
                default:
                    System.out.println("Invalid command.");
                    commands();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine(); // Clear the scanner buffer
            commands();
        }
    }
}