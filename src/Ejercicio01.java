/*
 * 
 */


import Entity.Book;
import Service.BookService;

/**
 *
 * @author Angelica
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BookService bs1 = new BookService();
        
        Book b1 = bs1.createBook();
        bs1.showBook(b1);
    }
    
}
