import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (!checkIfStockFull()){
            this.books.add(book);
        }
    }

    public boolean checkIfStockFull() {
        if (bookCount() < this.capacity) {
            return false;
        }
        return true;
    }

    public Book lendBook() {
        return this.books.remove(0);
    }

    public int booksByGenre(String genre) {
        int result = 0;
        for ( Book book : this.books) {
            if (book.getGenre() == genre ) {
                result += 1;
            }
        }
        return result;
    }
}
