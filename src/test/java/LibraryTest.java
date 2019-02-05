import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("Cloud Atlas", "David Mitchell", "Fantasy");
        book2 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        book3 = new Book("The Shining", "Stephen King", "Horror");
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

    @Test
    public void canCheckWhenStockIsNotFull() {
        assertEquals(false, library.checkIfStockFull());
    }

    @Test
    public void canCheckWhenStockIsFull() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.checkIfStockFull());
    }

    @Test
    public void cannotAddBookIfStockFull() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.bookCount());
    }

    @Test
    public void canRemoveBooksFromStock() {
        library.addBook(book);
        library.addBook(book);
        library.lendBook();
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canCountBooksByGenre() {
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.booksByGenre("Fantasy"));
    }

}
