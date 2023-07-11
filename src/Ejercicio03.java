/*
 * 
 */


import Entity.Operation;
import Service.OperationService;
import java.text.DecimalFormat;

/**
 *
 * @author Angelica
 */
public class Ejercicio03 {
      
    public static void main(String[] args) {
        
        DecimalFormat formato1 = new DecimalFormat("#.##");
        OperationService os1 = new OperationService();

        Operation o1 = os1.createOperation();
        
        int addition = os1.add(o1);
        int substraction = os1.substract(o1);
        int multiplication = os1.multiply(o1);
        double division = os1.divide(o1);
        
        System.out.println("");
        System.out.println("Suma = " + addition);
        System.out.println("Resta = " + substraction);
        System.out.println("Multiplicación = " + multiplication);
        System.out.println("División = " + formato1.format(division));
    }
}
