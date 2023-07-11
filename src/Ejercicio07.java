
import Entity.Person;
import Service.PersonService;
import java.time.LocalDate;

/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Ejercicio07 {
        
    public static void main(String[] args) {
        PersonService ps1 = new PersonService();
        Person p1 = ps1.createPerson("Kiki", LocalDate.of(1991, 9, 3), "F", 90, 1.60);        
        Person p2 = ps1.createPerson("Mari", LocalDate.of(2010, 3, 30), "F", 40, 1.50);
        Person p3 = ps1.createPerson("Gabo", LocalDate.of(2012, 6, 23), "M", 45, 1.48);
        Person p4 = ps1.createPerson("Said", LocalDate.of(1989, 4, 24), "M", 75, 1.70);
                
        calculateWeigth(p1, p2, p3, p4);
        calculateOfAge(p1, p2, p3, p4);
    }
    
    public static void calculateWeigth (Person... people) {
        PersonService ps1 = new PersonService();
        int underWeigth = 0;
        int healthyWeigth = 0;
        int overWeigth = 0;
        
        int bmi[] = new int[people.length];
        
        for (int i = 0; i < people.length; i++) {
            bmi[i] = ps1.calculateBMI(people[i]);  
            
            if (bmi[i] == -1) {
                underWeigth += 1;
            } else if (bmi[i] == 1) {
                healthyWeigth += 1;
            } else {
                overWeigth += 1;
            }
        }
            
        underWeigth *= (100 / people.length);    
        healthyWeigth *= (100 / people.length);    
        overWeigth *= (100 / people.length);
        
        System.out.println("CANTIDAD DE PERSONAS: " + people.length);
        System.out.println("Personas con bajo peso: " + underWeigth + "%");
        System.out.println("Personas con peso saludable: " + healthyWeigth + "%");
        System.out.println("Personas con sobrepeso: " + overWeigth + "%");
        System.out.println("");
    }
    
    public static void calculateOfAge (Person... people) {
        PersonService ps1 = new PersonService();
        int under18 = 0;
        int over18 = 0;
        
        boolean ofAge[] = new boolean[people.length];
        
        for (int i = 0; i < people.length; i++) {
            ofAge[i] = ps1.ofAge(people[i]);   
            
            if (ofAge[i] == true) {
                over18 += 1;
            } else {
                under18 += 1;
            }
        }
            
        over18 *= (100 / people.length);    
        under18 *= (100 / people.length);
        
        System.out.println("CANTIDAD DE PERSONAS: " + people.length);
        System.out.println("Personas mayores de edad: " + over18 + "%");
        System.out.println("Personas menores de edad: " + under18 + "%");
        System.out.println("");
    }
}
