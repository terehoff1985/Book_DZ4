package DZ_4;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<Book<?>, LibraryCard<?, ?>> books = new HashMap<>();

    public void addBook(Book<?> book) {
        books.put(book, null);
    }

    public void issueBook(Book<?> book, LibraryCard<?, ?> card) {
        books.put(book, card);
    }

    public void printIssuedBooks() {
        for (Map.Entry<Book<?>, LibraryCard<?, ?>> entry : books.entrySet()) {
            Book<?> book = entry.getKey();
            LibraryCard<?, ?> card = entry.getValue();
            if (card != null) {
                System.out.println("Книга: " + book.getTitle());
                System.out.println("Библиотечная карточка: " + card.getCardNumber());
                System.out.println("Информация о книге: " + card.getBookInfo());
                System.out.println();
            }
        }
    }

}