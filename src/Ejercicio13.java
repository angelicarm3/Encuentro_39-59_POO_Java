
import Entity.Course;
import Service.CourseService;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Ejercicio13 {
    private Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        CourseService cs1 = new CourseService();   
        Course c1 = cs1.createCourse();
        
        cs1.calculateWeeklyEarnings(c1);
    }
    
}
