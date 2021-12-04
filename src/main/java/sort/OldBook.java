package sort;

import java.util.Objects;

public class OldBook implements BookType{
    private String authorName;
    private String title;
    private int numOfPages;

    public OldBook(String authorName, String title, int numOfPages) {
        this.authorName = authorName;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldBook oldBook = (OldBook) o;
        return numOfPages == oldBook.numOfPages && Objects.equals(authorName, oldBook.authorName) && Objects.equals(title, oldBook.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, title, numOfPages);
    }

    @Override
    public String toString() {
        return "OldBook{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }

    @Override
    public String read() {
        return "Reading " + this.getClass().getName();
    }
}
