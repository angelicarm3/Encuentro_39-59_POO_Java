
import Entity.Person;
import Service.PersonService;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Ejercicio12 {
    private Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        PersonService ps1 = new PersonService();   
        Person p1 = ps1.createPerson2();
        
        boolean isYounger = ps1.youngerThan( p1);
        
        if (isYounger) {
            System.out.println("La edad ingresada es menor que la de la persona creada.");
        } else {
            System.out.println("La edad ingresada es mayor que la de la persona creada.");
        }
        
        ps1.showPerson(p1);
    }
    
}
