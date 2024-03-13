package DZ_4;
//Использовал дженерики в классах Book и Library.
//Удалил интерфейс BookInfo из класса Library.

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class Library<T extends Book> {

    private Map<T, LibraryCard<?, ?>> books = new HashMap<>();

    public void addBook(T book) {
        books.put(book, null);
    }

    public void issueBook(T book, LibraryCard<?, ?> card) {
        books.put(book, card);
    }

    public void printIssuedBooks() {
        for (Map.Entry<T, LibraryCard<?, ?>> entry : books.entrySet()) {
            T book = entry.getKey();
            LibraryCard<?, ?> card = entry.getValue();
            if (card != null) {
                System.out.println("Книга: " + book.getTitle());
                System.out.println("Библиотечная карточка: " + card.getCardNumber());
                System.out.println("Информация о книге: " + card.getBookInfo());
                System.out.println();
            }
        }
    }

    public Map<T, LibraryCard<?, ?>> getBooks() {
        return books;
    }

    public void setBooks(Map<T, LibraryCard<?, ?>> books) {
        this.books = books;
    }

}