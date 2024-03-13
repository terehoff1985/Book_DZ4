package DZ_4;
//Сделал класс LibraryCard взаимозаменяемым со своим базовым классом Object.

public class LibraryCard<K, V> {

    private K cardNumber;
    private V bookInfo;

    public LibraryCard(K cardNumber, V bookInfo) {
        this.cardNumber = cardNumber;
        this.bookInfo = bookInfo;
    }

    public K getCardNumber() {
        return cardNumber;
    }

    public V getBookInfo() {
        return bookInfo;
    }

}