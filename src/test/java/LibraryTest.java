import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Publisher published;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book();
        published = new Publisher();
        published.addBook(book);
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

    @Test
    public void emptyStock(){
        library.addBook(book);
        assertEquals(1,library.stockCount());
        library.clearStock();
        assertEquals(0, library.stockCount());
    }

    @Test
    public void stockIsFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.stockCount());
    }

    @Test
    public void canAddBook(){
        published.addBook(book);
        library.pickUp (published);
        assertEquals(1, library.stockCount());
    }
}
