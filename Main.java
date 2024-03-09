package DZ_4;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book<String> book1 = new Book<>("Война и мир");
        Book<String> book2 = new Book<>("Преступление и наказание");

        LibraryCard<Integer, String> card1 = new LibraryCard<>(12345, "Студент 1");
        LibraryCard<Integer, String> card2 = new LibraryCard<>(23456, "Студент 2");

        library.addBook(book1);
        library.addBook(book2);

        library.issueBook(book1, card1);
        library.issueBook(book2, card2);

        library.printIssuedBooks();
    }

}
