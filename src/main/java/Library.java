import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;



    public Library(int i){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        this.stock.add(book);
    }

    public void clearStock() {
        stock.clear();
    }
}
