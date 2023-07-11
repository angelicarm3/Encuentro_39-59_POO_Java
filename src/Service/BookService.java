/*
 * 
 */
package Service;

import java.util.Scanner;
import Entity.Book;

/**
 *
 * @author Angelica
 */
public class BookService {
        
    private Scanner leer = new Scanner(System.in);
    
    public Book createBook() {
        Book b = new Book();
        
        System.out.println("Ingrese el ISBN.");
        b.setIsbn(leer.nextLine());
        
        System.out.println("Ingrese el título del libro.");
        b.setTitle(leer.nextLine());
        
        System.out.println("Ingrese el autor del libro.");
        b.setAuthor(leer.nextLine());
        
        System.out.println("Ingrese el número de páginas.");
        b.setPageNumber(leer.nextInt());
        
        return b;
    }
    
    public void showBook(Book b) {
        System.out.println("ISBN: " + b.getIsbn());
        System.out.println("Título: " + b.getTitle());        
        System.out.println("Autor: " + b.getAuthor());       
        System.out.println("Autor: " + b.getPageNumber());
    }
}
