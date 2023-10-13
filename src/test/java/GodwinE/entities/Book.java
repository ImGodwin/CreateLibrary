package GodwinE.entities;

public class Book {

    private String author;
    private String type;
    private String title;
    private String yearPublished;
    private int pageAmount;

    public Book(String author, String type, String title, String date, int pageAmount) {
        this.author = author;
        this.type = type;
        this.title = title;
        this.yearPublished = yearPublished;
        this.pageAmount = pageAmount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", yearPublished='" + yearPublished + '\'' +
                ", pageAmount=" + pageAmount +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return yearPublished;
    }

    public void setDate(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }
}
