package sort;

import java.util.Objects;

public class BookComparator {

    private String authorName;
    private String title;
    private int numOfPages;

    public BookComparator() {
    }

    public BookComparator(String authorName, String title, int numOfPages) {
        this.authorName = authorName;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "BookComparator{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
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
        BookComparator that = (BookComparator) o;
        return numOfPages == that.numOfPages && Objects.equals(authorName, that.authorName) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, title, numOfPages);
    }
}
