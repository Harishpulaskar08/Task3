import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {

        if (findBook(book.getBookId()) != null) {
            System.out.println("Book ID already exists.");
            return;
        }

        books.add(book);
        System.out.println("Book added successfully.");
    }

    // View Books
    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n========== Library Books ==========");

        for (Book book : books) {

            System.out.println("--------------------------------");
            System.out.println(book);
        }

        System.out.println("--------------------------------");
    }

    // Search Book
    public void searchBook(int id) {

        Book book = findBook(id);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        System.out.println("\nBook Found");
        System.out.println("------------------------------");
        System.out.println(book);
        System.out.println("------------------------------");
    }

    // Issue Book
    public void issueBook(int id, User user) {

        Book book = findBook(id);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book is already issued.");
            return;
        }

        book.setIssued(true);

        System.out.println("Book issued successfully to " + user.getName());
    }

    // Return Book
    public void returnBook(int id) {

        Book book = findBook(id);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isIssued()) {
            System.out.println("Book is already available.");
            return;
        }

        book.setIssued(false);

        System.out.println("Book returned successfully.");
    }

    // Helper Method
    private Book findBook(int id) {

        for (Book book : books) {

            if (book.getBookId() == id) {
                return book;
            }
        }

        return null;
    }
}