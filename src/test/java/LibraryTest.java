import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();
    }

    @Test
    public void stockIsEmpty(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void addToStock(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }
}
