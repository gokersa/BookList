import java.util.Date;

public class Book {

    public String bookName;
    public int bookPage;
    public String authorName;
    public int publishDate;

    public Book(String bookName, int bookPage, String authorName, int publishDate) {
        super();
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
}

