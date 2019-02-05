import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Cloud Atlas", "David Mitchell", "Fantasy");
    }

    @Test
    public void canCountBooksInLibrary() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibraryStock() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

}
