package DZ_4;
//Разделил класс Book на два класса: Book и Library.

public class Book<T> {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}
