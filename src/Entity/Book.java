/*
 * 
 */
package Entity;

/**
 * 
 * @author Angelica
 */
public class Book {
    
    private String isbn;
    private String title;
    private String author;
    private int pageNumber;

    public Book() {
    }

    public Book(String isbn, String title, String author, int pageNumber) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }
}
