/*
 * 
 */
package Service;

import Entity.Points;
import Entity.Song;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class PointsService {

    private Scanner leer = new Scanner(System.in);

    public Points createPoints() {
        System.out.println("Ingrese la coordenada x del punto 1.");
        int x1 = leer.nextInt();
        
        System.out.println("Ingrese la coordenada y del punto 1.");
        int y1 = leer.nextInt();
        
        System.out.println("Ingrese la coordenada x del punto 2.");
        int x2 = leer.nextInt();
        
        System.out.println("Ingrese la coordenada y del punto 2.");
        int y2 = leer.nextInt();
        
        return new Points(x1, y1, x2, y2);
    }
    
    public double calculateDistance(Points p) {   
        double x1 = p.getX1();
        double y1 = p.getY1();
        double x2 = p.getX2();
        double y2 = p.getY2();
        
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
