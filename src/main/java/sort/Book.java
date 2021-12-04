package sort;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String authorName;
    private String title;
    private int numOfPages;

    public Book() {
    }

    public Book(String authorName, String title, int numOfPages) {
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
        Book book = (Book) o;
        return numOfPages == book.numOfPages && Objects.equals(authorName, book.authorName) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, title, numOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }

//    @Override
//    public int compareTo(Book o) {
//        return this.authorName.compareTo(o.authorName);
//    }

//    @Override
//    public int compareTo(Book o) {
//        // for ascending order
//        return Integer.compare(this.numOfPages, o.getNumOfPages());
//    }

    @Override
    public int compareTo(Book o) {
        // for descending order
        return Integer.compare(o.getNumOfPages(), this.numOfPages);
    }
}
