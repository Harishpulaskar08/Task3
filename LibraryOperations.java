public abstract class LibraryOperations {

    public abstract void addBook(Book book);

    public abstract void viewBooks();

    public abstract void searchBook(int bookId);

    public abstract void issueBook(int bookId, User user);

    public abstract void returnBook(int bookId);
}