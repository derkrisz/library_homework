import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PublisherTest {

    Publisher publisher;
    Book book;

    @Before
    public void before() {
        publisher = new Publisher();
        book = new Book();
    }

    @Test
    public void canAddBook(){
        publisher.addBook(book);
        assertEquals(1, publisher.getPublishedCount());
    }

    @Test
    public void canRemoveBook(){
        publisher.addBook(book);
        Book book = publisher.removeBook();
        assertEquals(0, publisher.getPublishedCount());
    }
}
