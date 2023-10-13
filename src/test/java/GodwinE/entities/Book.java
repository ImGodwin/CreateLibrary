package GodwinE.entities;

public class Book {

    private String isbnCode;
    private String author;
    private String type;
    private String title;
    private String yearPublished;
    private int pageAmount;

    public Book(String isbnCode, String author, String type, String title, String yearPublished, int pageAmount) {
        this.isbnCode = isbnCode;
        this.author = author;
        this.type = type;
        this.title = title;
        this.yearPublished = yearPublished;
        this.pageAmount = pageAmount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnCode='" + isbnCode + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", yearPublished='" + yearPublished + '\'' +
                ", pageAmount=" + pageAmount +
                '}';
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
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

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }
}
