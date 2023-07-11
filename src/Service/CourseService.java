/*
 * 
 */
package Service;

import Entity.Course;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class CourseService {

    private Scanner leer = new Scanner(System.in);

    public Course createCourse() {
        /*
        * Creates a Course object.
        * return: Person object. 
        */    
        boolean valid = false;
        String shift = "";
        Course c1 = new Course();
        
        System.out.println("Ingrese el nombre del curso.");
        c1.setCourseName(leer.nextLine());
        
        System.out.println("Ingrese la cantidad de horas por día.");
        c1.setDailyHours(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de días por semana.");
        c1.setWeeklyDays(leer.nextInt());
        leer.nextLine();
        do {
            System.out.println("Ingrese el turno. (AM/PM)");
            shift = leer.nextLine().toUpperCase();
            valid = validateShift(shift);
        } while (!valid);
        
        if (shift.equals("AM")) {
            c1.setShift("Mañana");
        } else {
            c1.setShift("Tarde");
        }
                
        System.out.println("Ingrese el precio por hora.");
        c1.setHourlyPrice(leer.nextInt());
        leer.nextLine();
        
        c1.setAlumni(uploadAlumni());
        
        return c1;
    }
    
    private boolean validateShift(String shift) {
        if (shift.equals("AM") || shift.equals("PM")) {
            return true;                     
        } else {
            System.out.println("Ingrese una opcion válida.");
            return false;
        }
    }
    
    private String[] uploadAlumni() {
        /*
        * Asks for the alumni names and stores it in an array
        * return: alumniList
        */
        String[] alumniList = new String[5];
        
        for (int i = 0; i < alumniList.length; i++) {
            System.out.println("Ingrese el nombre del alumno.");
            alumniList[i] = leer.nextLine();
        }
        
        return alumniList;
    }
    
    public void calculateWeeklyEarnings(Course c) {
        /*
        * Receives a Course object an calculates its weekly earnings.
        * dailyHours * hourlyPrice * alumni quantity * weeklyDays
        */
        double weeklyEarnings = c.getDailyHours() * c.getHourlyPrice() * c.getWeeklyDays() * c.getAlumni().length; 
        
        System.out.println("La ganancia por semana es de: " + weeklyEarnings);
    }
}
