/*
 * 
 */
package Service;

import Entity.Roots;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class RootsService {

    private Scanner leer = new Scanner(System.in);

    public Roots createRoots() {
        System.out.println("Ingrese el valor de a.");
        int a = leer.nextInt();
        
        System.out.println("Ingrese el valor de b.");
        int b = leer.nextInt();
        
        System.out.println("Ingrese el valor de c.");
        int c = leer.nextInt();
        
        return new Roots(a, b, c);
    }
    
    public void calculate(Roots r) {
        boolean hasRoots = validateRoots(r);
        boolean hasRoot = validateRoot(r);
        
        if (hasRoots) {
            getRoots(r, hasRoots);
        } else if (hasRoot) {
            getRoot(r, hasRoot);
        } else {
            System.out.println("La ecuación cuadrática no tiene raíces reales.");
        }
    }

    private boolean validateRoots(Roots r) {        
        double discriminant = getDiscriminant(r);
        
        if (discriminant > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean validateRoot(Roots r) {        
        double discriminant = getDiscriminant(r);
        
        if (discriminant == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    private double getDiscriminant(Roots r) {
        double a = r.getA();
        double b = r.getB();
        double c = r.getC();
        
        return Math.pow(b, 2) - (4 * a * c);
    }
    
    private void getRoots(Roots r, boolean hasRoots) {
        double solution1 = ((r.getB() * -1) + Math.sqrt(getDiscriminant(r))) / (2 * r.getA());
        double solution2 = ((r.getB() * -1) - Math.sqrt(getDiscriminant(r))) / (2 * r.getA());
        
        System.out.println("Soluciones: ");
        System.out.println("x = " + solution1);
        System.out.println("x = " + solution2);
    }
    
    private void getRoot(Roots r, boolean hasRoot) {
        double solution = (r.getB() * -1) / (2 * r.getA());
        
        System.out.println("Solución: ");
        System.out.println("x = " + solution);
    }
}
