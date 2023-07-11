/*
 * 
 */


import Entity.Rectangle;
import Service.RectangleService;

/**
 *
 * @author Angelica
 */
public class Ejercicio04 {
      
    public static void main(String[] args) {
        
        RectangleService rs1 = new RectangleService();

        Rectangle r1 = rs1.createRectangle();
                      
        System.out.println("Suma = " + rs1.calculateArea(r1));
        System.out.println("Resta = " + rs1.calculatePerimeter(r1));
        rs1.showRectangle(r1);
    }
}
