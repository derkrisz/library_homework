import java.util.ArrayList;

public class Publisher {

    private ArrayList<Book> published;

    public Publisher(){
        this.published = new ArrayList<>();
    }

    public int getPublishedCount() {
        return published.size();
    }

    public void addBook(Book book) {
        published.add(book);
    }

    public Book removeBook() {
        return published.remove(0);
    }
}
