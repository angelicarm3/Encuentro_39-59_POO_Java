/*
 * 
 */
package Service;

import Entity.Date;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class DateService {
    
    private Scanner leer = new Scanner(System.in);
     
    public Date createDate() {
        /*
        * Recieves data and creates a Date object.
        * return: Date object. 
        */           
        System.out.println("Ingrese el año (AAAA)");
        int year = leer.nextInt();
        
        System.out.println("Ingrese el mes (MM)");
        int month = leer.nextInt();
        
        System.out.println("Ingrese el día (DD)");
        int day = leer.nextInt();
        
        LocalDate inputDate = LocalDate.of(year, month, day);
                                       
        return new Date(inputDate);
    }
}
