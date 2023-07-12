
import Entity.Points;
import Service.PointsService;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Extra2 {
    private Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        PointsService ps1 = new PointsService();
        Points p1 = ps1.createPoints();
        
        System.out.println("La distancia entre los puntos es de: " + ps1.calculateDistance(p1));
    }
    
}
