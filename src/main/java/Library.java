import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;



    public Library(int capacity){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (stockCount() < capacity) {
            stock.add(book);
        }
    }

    public void clearStock() {
        stock.clear();
    }

    public void pickUp(Publisher published) {
        Book book = published.removeBook();
        addBook(book);
    }
}
