import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> bookCollection;

    public Borrower(String name) {
        this.name = name;
        this.bookCollection = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        this.bookCollection.add(book);
    }

    public void borrowBook(Library library) {
        Book bookToBorrow = library.lendBook();
        this.addBook(bookToBorrow);
    }
}
