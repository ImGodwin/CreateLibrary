package GodwinE.entities;

import java.util.List;

public class Magazine {

    private String isbnCode;
    private String title;
    private String yearPublished;
    private int pageAmount;
    private List<String> publicationsType;

    public Magazine(String isbnCode, String title, String yearPublished, int pageAmount, List<String> publicationsType) {
        this.isbnCode = isbnCode;
        this.title = title;
        this.yearPublished = yearPublished;
        this.pageAmount = pageAmount;
        this.publicationsType = publicationsType;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "isbnCode='" + isbnCode + '\'' +
                ", title='" + title + '\'' +
                ", yearPublished='" + yearPublished + '\'' +
                ", pageAmount=" + pageAmount +
                ", publicationsType=" + publicationsType +
                '}';
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
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

    public List<String> getPublicationsType() {
        return publicationsType;
    }

    public void setPublicationsType(List<String> publicationsType) {
        this.publicationsType = publicationsType;
    }
}
