import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Runtime Polymorphism
        LibraryOperations library = new Library();

        while (true) {

            System.out.println("\n====================================");
            System.out.println("     Library Management System");
            System.out.println("====================================");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("Enter Book ID: ");
                        int bookId = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Book Title: ");
                        String title = sc.nextLine();

                        if (title.trim().isEmpty()) {
                            System.out.println("Book title cannot be empty.");
                            break;
                        }

                        System.out.print("Enter Author Name: ");
                        String author = sc.nextLine();

                        if (author.trim().isEmpty()) {
                            System.out.println("Author name cannot be empty.");
                            break;
                        }

                        library.addBook(new Book(bookId, title, author));

                        break;

                    case 2:

                        library.viewBooks();

                        break;

                    case 3:

                        System.out.print("Enter Book ID: ");
                        bookId = sc.nextInt();

                        library.searchBook(bookId);

                        break;

                    case 4:

                        System.out.print("Enter Book ID: ");
                        bookId = sc.nextInt();

                        System.out.print("Enter User ID: ");
                        int userId = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter User Name: ");
                        String userName = sc.nextLine();

                        User user = new User(userId, userName);

                        library.issueBook(bookId, user);

                        break;

                    case 5:

                        System.out.print("Enter Book ID: ");
                        bookId = sc.nextInt();

                        library.returnBook(bookId);

                        break;

                    case 6:

                        System.out.println("Thank You!");

                        sc.close();
                        System.exit(0);

                    default:

                        System.out.println("Invalid Choice.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid Input! Please enter the correct data.");

                sc.nextLine();
            }
        }
    }
}