
import java.util.*;

public class hello {
    static Scanner sc = new Scanner(System.in);
    static String[] books;
    static int count = 0;
    static String[] ibooks;
    static int size;
    static int icount = 0;
    static int acount = 0;

    public static void sizeOfArray() {
        System.out.println("Enter the number of Books: ");
        size = sc.nextInt();
        books = new String[size];
        ibooks = new String[size];
        sc.nextLine();
        commands();
    }

    public static int add() {
        if (count < size) {
            System.out.println("Enter the name of the book to be added: ");
            books[count] = sc.nextLine();
            System.out.println("The book is successfully added...");
            count++;
            acount++;
            return count;
        } else {
            System.out.println("The library is full....");
        }
        commands();
        return count;
    }

    public static void issue() {
        boolean check = false;
        System.out.println("Enter the book to be issued: ");
        String issueBook = sc.nextLine().toLowerCase();

        for (int i = 0; i < count; i++) {
            if (issueBook.equals(books[i].toLowerCase())) {
                check = true;
                ibooks[icount] = books[i];
                icount++;
                System.out.println("The book '" + books[i] + "' is successfully issued...");
                break;
            }
        }

        if (!check) {
            System.out.println("The book is not available in the library.");
        }
        commands();
    }

    public static void retMethod() {
        if (icount == 0) {
            System.out.println("There is no issued book in the library!!");
        } else {
            System.out.println("Enter the name of the book to be returned: ");
            String retbook = sc.nextLine().trim();
            boolean found = false;

            for (int i = 0; i < icount; i++) {
                if (retbook.equalsIgnoreCase(ibooks[i])) {
                    ibooks[i] = null;
                    System.out.println("The book is successfully returned...");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("There is no such issued book....");
            }
        }
        commands();
    }

    public static void list() {
        System.out.print("List of issued books: ");
        for (String book : ibooks) {
            if (book != null) {
                System.out.print(book + ", ");
            }
        }
        System.out.println();
        commands();
    }

    public static void commands() {
        String com = "start";
        while (!com.equalsIgnoreCase("exit")) {
            System.out.println("Enter the commands[return,list,add,issue,exit]:");
            com = sc.nextLine();
            switch (com.trim().toLowerCase()) {
                case "return":
                    retMethod();
                    System.out.println("Return");

                    break;
                case "list":
                    list();
                    // System.out.println("List");
                    break;
                case "add":
                    add();
                    // System.out.println("Add");
                    break;
                case "issue":
                    issue();
                    System.out.println("issue");
                    break;
                case "exit":
                    System.out.println("You are successfully exited the library...");
                    return;
                // break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("This is an online Library....");
        sizeOfArray();
    }
}