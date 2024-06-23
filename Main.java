
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog=new LibraryCatalog();
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("\n----Library Management System----");
            System.out.println("1. Add a book");
            System.out.println("2. Search book by title");
            System.out.println("3. check out a book");
            System.out.println("4. Return a book");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            System.out.println("Choose an opotion: ");
            int option=sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    catalog.addBook(new Book(title, author));
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter book title to search: ");
                    title = sc.nextLine();
                    Book book = catalog.searchByTitle(title);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("No book found with the title: " + title);
                    }
                    break;
                case 3:
                    System.out.print("Enter book title to check out: ");
                    title = sc.nextLine();
                    if (catalog.checkOutBook(title)) {
                        System.out.println("Book checked out successfully.");
                    } else {
                        System.out.println("Book not available for check out or not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    title = sc.nextLine();
                    if (catalog.returnBook(title)) {
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book not found or not checked out.");
                    }
                    break;
                case 5:
                    System.out.println("All books in the catalog:");
                    catalog.displayBooks();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}