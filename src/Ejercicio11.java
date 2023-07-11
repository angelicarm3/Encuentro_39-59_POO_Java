
import Entity.Date;
import Service.DateService;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Ejercicio11 {
    private Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        DateService ds1 = new DateService();   
        Date d1 = ds1.createDate();
        
        calculateYears(d1);
    }
    
    public static void calculateYears(Date d) {
        LocalDate today = LocalDate.now(); 
        Period period = Period.between(d.getDate(), today);
        
        int years = period.getYears();
        
        System.out.println("Han pasado " + years + " años desde " + d.getDate());
    }
}
