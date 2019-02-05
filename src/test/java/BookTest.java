import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Cloud Atlas", "David Mitchell", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Cloud Atlas", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("David Mitchell", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }


}
