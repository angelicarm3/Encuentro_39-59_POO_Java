/*
 * 
 */
package Service;

import Entity.Rectangle;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class RectangleService {
    
    private Scanner leer = new Scanner(System.in);
    
    public Rectangle createRectangle() {
                
        System.out.println("Ingrese la base del rectángulo en cm.");
        int base = (leer.nextInt());
        
        System.out.println("Ingrese la altura del rectángulo en cm.");
        int heigth = (leer.nextInt());
        
        return new Rectangle(base, heigth);        
    }
    
    public int calculateArea(Rectangle r) {
        
        int area =  r.getBase() * r.getHeigth();
        
        System.out.println("Área: " + area + "cm2.");
        
        return area;
    }
    
    public int calculatePerimeter(Rectangle r) {
        
        int perimeter =  (r.getBase() * r.getHeigth()) * 2;
        
        System.out.println("Perimetro: " + perimeter + "cm.");
        
        return perimeter;
    }
    
    public void showRectangle (Rectangle r) {
        
        int base = r.getBase();
        int heigth = r.getHeigth();
        
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == heigth - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == base - 1) {
                        System.out.print("*");
                } else {
                    System.out.print(" ");
                }                
            }
            System.out.println("");
        } 
    }
}
