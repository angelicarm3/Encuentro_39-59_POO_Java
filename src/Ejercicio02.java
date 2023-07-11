/*
 * 
 */


import Entity.Circumference;
import Service.CircumferenceService;

/**
 *
 * @author Angelica
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        CircumferenceService cs1 = new CircumferenceService();

        Circumference c1 = cs1.createCircumference();
        
        cs1.calculateArea(c1);
        cs1.calculatePerimeter(c1);
    }
}
