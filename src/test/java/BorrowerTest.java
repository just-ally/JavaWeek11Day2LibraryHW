import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Frank");
        book = new Book("Cloud Atlas", "David Mitchell", "Fantasy");
        library = new Library(3);
        library.addBook(book);
    }

    @Test
    public void startsWithEmptyCollection() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBookToCollection() {
        borrower.addBook(book);
    }

    @Test
    public void canBorrowBookFromLibrary() {
        borrower.borrowBook(library);
        assertEquals(1, borrower.bookCount());
    }
}
