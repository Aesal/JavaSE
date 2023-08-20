package section09;

public class Book {
    String title;

    int price;

    int totalPage;

    String author;



    public Book() {
        this.title = "멘토씨리즈 자바";
        this.price = 32000;
        this.totalPage = 603;
        this.author = "김영우";
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", totalPage=" + totalPage +
                ", author='" + author + '\'' +
                '}';
    }
}
