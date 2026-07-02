import java.util.ArrayList;

public class Library extends LibraryOperations {

    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    @Override
    public void addBook(Book book) {

        if (findBookById(book.getBookId()) != null) {
            System.out.println("Book ID already exists.");
            return;
        }

        books.add(book);
        System.out.println("Book added successfully.");
    }

    // View Books
    @Override
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
    @Override
    public void searchBook(int bookId) {

        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        System.out.println("\nBook Found");
        System.out.println("----------------------------");
        System.out.println(book);
        System.out.println("----------------------------");
    }

    // Issue Book
    @Override
    public void issueBook(int bookId, User user) {

        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book is already issued.");
            return;
        }

        book.setIssued(true);

        System.out.println("Book issued successfully.");
        System.out.println("Issued To : " + user.getUserName());
    }

    // Return Book
    @Override
    public void returnBook(int bookId) {

        Book book = findBookById(bookId);

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
    private Book findBookById(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }
}