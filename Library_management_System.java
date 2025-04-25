import java.util.Scanner;

public class Library_management_System {
    private String[] books; // Array to store all books in the library
    private String[] issuedBooks; // Array to store issued books
    private int bookCount;
    private int issuedBookCount;

    public Library(int capacity) {
        
        books = new String[capacity];
        issuedBooks = new String[capacity];
        bookCount = 0;
        issuedBookCount = 0;
    }

    // Method to add a book to the library
    public void addBook(String book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book \"" + book + "\" added to the library.");
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    // Method to issue a book from the library
    public void issueBook(String book) {
        int bookIndex = findBookIndex(books, book, bookCount);
        if (bookIndex != -1 && findBookIndex(issuedBooks, book, issuedBookCount) == -1) {
            issuedBooks[issuedBookCount] = book;
            issuedBookCount++;
            System.out.println("Book \"" + book + "\" has been issued.");
        } else if (bookIndex == -1) {
            System.out.println("Book \"" + book + "\" is not available in the library.");
        } else {
            System.out.println("Book \"" + book + "\" is already issued.");
        }
    }

    // Method to return a book to the library
    public void returnBook(String book) {
        int issuedBookIndex = findBookIndex(issuedBooks, book, issuedBookCount);
        if (issuedBookIndex != -1) {
            for (int i = issuedBookIndex; i < issuedBookCount - 1; i++) {
                issuedBooks[i] = issuedBooks[i + 1];
            }
            issuedBookCount--;
            issuedBooks[issuedBookCount] = null;
            System.out.println("Book \"" + book + "\" has been returned.");
        } else {
            System.out.println("Book \"" + book + "\" was not issued.");
        }
    }

    // Method to get the list of issued books
    public void getIssuedBooks() {
        System.out.print("Issued Books: ");
        for (int i = 0; i < issuedBookCount; i++) {
            System.out.print(issuedBooks[i]);
            if (i < issuedBookCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Helper method to find the index of a book in an array
    private int findBookIndex(String[] booksArray, String book, int count) {
        for (int i = 0; i < count; i++) {
            if (booksArray[i].equals(book)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity of the library:");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Library library = new Library(capacity);

        String command;

        while (true) {
            System.out.println("\nEnter a command (add, issue, return, list, exit):");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "add":
                    System.out.println("Enter the book title to add:");
                    String addBookTitle = scanner.nextLine();
                    library.addBook(addBookTitle);
                    break;
                case "issue":
                    System.out.println("Enter the book title to issue:");
                    String issueBookTitle = scanner.nextLine();
                    library.issueBook(issueBookTitle);
                    break;
                case "return":
                    System.out.println("Enter the book title to return:");
                    String returnBookTitle = scanner.nextLine();
                    library.returnBook(returnBookTitle);
                    break;
                case "list":
                    library.getIssuedBooks();
                    break;
                case "exit":
                    System.out.println("Exiting the library system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}