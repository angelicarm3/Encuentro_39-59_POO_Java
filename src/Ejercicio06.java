/*
 * 
 */


import Entity.CoffeeMaker;
import Service.CoffeeMakerService;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class Ejercicio06 {
        
    public static void main(String[] args) {
        CoffeeMakerService cms1 = new CoffeeMakerService();
        CoffeeMaker cma1 = cms1.createCoffeeMaker();
                
        cms1.menu(cma1);
    }
}
