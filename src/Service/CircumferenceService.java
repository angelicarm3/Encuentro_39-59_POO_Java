/*
 * 
 */
package Service;

import Entity.Circumference;
import static java.lang.Math.PI;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class CircumferenceService {
    
    private DecimalFormat formato1 = new DecimalFormat("#.##");
    private Scanner leer = new Scanner(System.in);
    
    public Circumference createCircumference() {
                
        System.out.println("Ingrese el radio de la circunferencia en cm.");
        float radius = (leer.nextFloat());
        
        return new Circumference(radius);        
    }
    
    public void calculateArea(Circumference c) {
        
        double area =  PI * Math.pow(c.getRadius(), 2);
        
        System.out.println("Área: " + formato1.format(area) + "cm2.");
    }
    
    public void calculatePerimeter(Circumference c) {
        
        double perimeter =  2 * PI * c.getRadius();
        
        System.out.println("Perimetro: " + formato1.format(perimeter) + "cm.");
    }
}
